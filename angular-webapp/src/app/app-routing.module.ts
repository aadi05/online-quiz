import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TestComponent} from './test/test.component';
import { ReviewComponent } from './review/review.component';
import { ResultsComponent } from './results/results.component';


const routes: Routes = [
  {path:'test',component:TestComponent},
  {path:'review',component:ReviewComponent},
  {path:'results',component:ResultsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
