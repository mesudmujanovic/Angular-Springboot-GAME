import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ScoreService {

  private userScore: number = 0;

  constructor() { }

  setScore(score:number){
    this.userScore+= score;
  }

  getScore(){
    return this.userScore;
  }

  
}
