import { Component } from '@angular/core';
import { ScoreService } from 'src/app/service/score.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  score: number = 5;

  constructor(private scoreService: ScoreService){}

  zavrsiKviz(){
    const trenutnoBodovanje = this.scoreService.getScore();
    const ukupono = trenutnoBodovanje + this.score;
    console.log(ukupono);
    
  }
 

  ngOnInit(){

  }
}
