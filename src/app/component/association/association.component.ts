import { Component } from '@angular/core';
import { Observable, catchError, filter, first, map, of, take, tap } from 'rxjs';
import { Association } from 'src/app/interface/Association-interface';
import { AssociationService } from 'src/app/service/association.service';

@Component({
  selector: 'app-association',
  templateUrl: './association.component.html',
  styleUrls: ['./association.component.css']
})
export class AssociationComponent {

  allAssoc$: Observable<Association[]>
  randIndexAssoc: any;
  itemText: { [key: string]: string[] };
  columnAInput;
  columnBInput;
  columnCInput;
  columnDInput;
  showAllColumnAItems: boolean = false;

  constructor(private assocService: AssociationService) {
    this.itemText = { A: ["a1", "a2", "a3", "a4"], B: ["b1", "b2", "b3", "b4"], C: ["c1", "c2", "c3", "c4"], D: ["d1", "d2", "d3", "d4"] };

  }

  showText(item: string, column: string, index: number): void {
    this.itemText[column][index] = item;
  }

  handleInputChangeB(): void {
    const solution = this.getSolutionForColumn('columnB');
    if (this.columnBInput === solution) {
      this.itemText = { B: this.randIndexAssoc.columnB }
      console.log("tacno");
    } else {
      console.log("netacno");
    }
  }
  handleInputChangeC(): void {
    const solution = this.getSolutionForColumn('columnC');
    if (this.columnCInput === solution) {
      this.itemText = { C: this.randIndexAssoc.columnC }
      console.log("tacno");
    } else {
      console.log("netacno");
    }
  }
  handleInputChangeD(): void {
    const solution = this.getSolutionForColumn('columnD');
    if (this.columnDInput === solution) {
      this.itemText = { D: this.randIndexAssoc.columnD }
      console.log("tacno");
    } else {
      console.log("netacno");
    }
  }

  handleInputChangeA(): void {
    const solution = this.getSolutionForColumn('columnA');
    if (this.columnAInput === solution) {
      this.itemText = { A: this.randIndexAssoc.columnA }
      console.log('Tačno');
    } else {
      console.log('Netačno');
    }
  }

  getAllAssoc(): Observable<Association[]> {
    return this.allAssoc$ = this.assocService.getAll().pipe(
      catchError((error) => {
        console.log("error", error);
        return of([]);
      })
    )
  }


  ngOnInit(): void {
    this.getAllAssoc().pipe(
      map(resp => {
        console.log("resp", resp);
        const allAs = resp;
        const random = Math.floor(Math.random() * allAs.length)
        this.randIndexAssoc = allAs[random]
        this.randIndexAssoc.columnA_solution = this.getSolutionForColumn('columnA');
        this.randIndexAssoc.columnB_solution = this.getSolutionForColumn('columnB');
        this.randIndexAssoc.columnC_solution = this.getSolutionForColumn('columnC');
        this.randIndexAssoc.columnD_solution = this.getSolutionForColumn('columnD');
        console.log("rand", this.randIndexAssoc);
        console.log('columnA:', this.randIndexAssoc.columnA_solution);

      })
    ).subscribe(assoc => {
    });
  }

  //prolazimo kroz solution i vracamo samo ono sto pocinje sa column da bi mogli da dodelimo gore povise svakoj koloni konacan rezultat
  getSolutionForColumn(column: string): string {
    const solution = this.randIndexAssoc.solutions.find(s => s.startsWith(column));
    if (solution) {
      return solution.split('_')[1];
    }
    return '';
  }

}
