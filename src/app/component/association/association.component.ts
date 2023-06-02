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
  div1: string;
  col1: string[];
  
  constructor( private assocService: AssociationService ){
  }

  getAllAssoc(): Observable<Association[]>{
    return this.allAssoc$ = this.assocService.getAll().pipe(
      catchError( (error) =>{
        console.log("error",error);
        return of([]);
      })
    )
  }

  
ngOnInit(): void {
  this.getAllAssoc().pipe(
    map(resp => resp.find(item => item.id === 6))
  ).subscribe(assoc => {
    console.log("response", assoc);
    if (assoc) {
      this.div1 = JSON.stringify(assoc.columnA);
      this.col1 = JSON.parse(this.div1);
      console.log("col1", this.col1);
    }
  });
}
}
