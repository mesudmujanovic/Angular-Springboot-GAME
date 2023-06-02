import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyNumberComponent } from './component/my-number/my-number.component';
import { UserComponent } from './component/user/user.component';

const routes: Routes = [
  // {path:'', component: MyNumberComponent },
  // {path:'user', component:UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
