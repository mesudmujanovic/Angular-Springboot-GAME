import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { BehaviorSubject, Observable, catchError, of, switchMap, tap } from 'rxjs';
import { User } from 'src/app/interface/User-Interface';
import { ScoreService } from 'src/app/service/score.service';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  public users$: Observable<User[]>
  score: number = 10;
  userForm: FormGroup
  constructor(private scoreService: ScoreService,
              private formBuilder: FormBuilder,
              private userService: UserService){
    this.userForm = this.formBuilder.group({
      username:['',Validators.required]
    })
  }

  onUser(){
    if(this.userForm.valid){
      const trenutnoBodovanje = this.scoreService.getScore();
      const userscore = trenutnoBodovanje + this.score;
      console.log(userscore);
       const username = this.userForm.get('username')?.value;
       this.userService.addUser(userscore,username).pipe(
        switchMap(() => this.allUsers() ),
        tap( response =>{
          console.log("ukupno",userscore, "username",username);
        })
       ).subscribe( () =>{
        console.log("subscribe");
       })
    }
  }

  allUsers(): Observable<User[]>{
   return this.users$ = this.userService.allUsers().pipe(
    catchError( error =>{
      console.log("error",error);
       return of ([]);
    })
   )
  }

  ngOnInit(){
    this.allUsers().subscribe(
      users => {
        console.log(users);
      }
     )
  }
}
