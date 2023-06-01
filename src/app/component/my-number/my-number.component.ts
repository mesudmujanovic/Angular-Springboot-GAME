import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { MyNumberService } from 'src/app/service/my-number.service';
import { Observable, catchError, of } from 'rxjs';
import { MyNumber } from 'src/app/interface/MyNumber-Interface';
import { ScoreService } from 'src/app/service/score.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-my-number',
  templateUrl: './my-number.component.html',
  styleUrls: ['./my-number.component.css']
})
export class MyNumberComponent {

  allNumber$: Observable<MyNumber[]>
  num1: number;
  num2: number;
  num3: number;
  num4: number;
  num5: number;
  num6: number;
  currentDivIndex: number = 1;
  result: number;
  public counter: number = 60
  public toShow: any;
  public currValue: string = '';
  public counterButton: number = 0;
  public score: number = 0;

  constructor(private http: HttpClient,
    private myNumberService: MyNumberService,
    private serviceScore: ScoreService,
    private router: Router) { }

  addNumToDivs() {
    const currentNum = this['num' + this.currentDivIndex];
    const currentDiv = document.getElementById('num' + this.currentDivIndex);
    if (currentDiv) {
      currentDiv.classList.add('numSpin');
      currentDiv.textContent = currentNum.toString();
      const divs = document.getElementsByClassName('num');
      for (let i = 0; i < divs.length; i++) {
        const div = divs[i];
        if (div.id !== currentDiv.id || i === divs.length - 1) {
          div.classList.remove('numSpin');
        }
      }
    }
    const calcDiv = document.getElementsByClassName('containerCalc')[0];
    this.currentDivIndex++;
    this.counterButton++;
    console.log(this.counterButton);
    if (this.counterButton === 6) {
      calcDiv.classList.remove('hide')
    }
  }

  getAllNumbers(): Observable<MyNumber[]> {
    return this.allNumber$ = this.myNumberService.getAllNumber().pipe(
      catchError((error) => {
        console.log("errorGET", error);
        return of();
      })
    )
  }

  ngOnInit() {
    this.getAllNumbers().subscribe(
      numbers => {
        const randIndex = Math.floor(Math.random() * numbers.length);
        const randomNumArr = numbers[randIndex];
        this.num1 = randomNumArr.number1;
        this.num2 = randomNumArr.number2;
        this.num3 = randomNumArr.number3;
        this.num4 = randomNumArr.number4;
        this.num5 = randomNumArr.number5;
        this.num6 = randomNumArr.number6;
        this.result = randomNumArr.result;
        console.log(numbers);
        console.log(randomNumArr);
        console.log(this.num1, this.num2);
        console.log(this.num3, this.num4);
        console.log(this.num5, this.num6, this.result);

      }
    )
  }

  equals() {
    const allNumbers = [
      this.num1.toString(),
      this.num2.toString(),
      this.num3.toString(),
      this.num4.toString(),
      this.num5.toString(),
      this.num6.toString()
    ];

    const enteredNumbers = this.toShow.match(/\d+/g);
    if (
      enteredNumbers.every((everyNumber) => {
        return allNumbers.includes(everyNumber);
      })
    ) {
      try {
        this.toShow = eval(this.toShow);
        alert("Čestitamo! Pogodili ste tačan broj!");
        this.score += 10;
        const nowScore = this.serviceScore.getScore();
        const allScore = nowScore + this.score;
        this.serviceScore.setScore(allScore);
        this.router.navigate(['/user']);
        console.log(this.score);
      } catch (err) {
        console.log(err);
      }
    } else {
      alert(
        "Žao nam je, niste pobedili!! Broj koji ste uneli ne pripada grupi vaših izabranih brojeva, pokušajte ponovo"
      );
      this.router.navigate(['/user']);
      // location.reload();
    }
  }

  writeToInput(value: string) {
    this.currValue = this.currValue + value;
    this.toShow = this.currValue;
  }

  clear() {
    this.toShow = '0'
  }

  back() {
    this.currValue = this.currValue.slice(0, -1);
    this.toShow = this.currValue;
  }

}
