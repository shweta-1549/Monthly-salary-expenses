import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { Component } from '@angular/core';
import { FeedbackComponent } from './feedback/feedback.component';
import { ViewFeedbackComponent } from './view-feedback/view-feedback.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { ViewRegisterComponent } from './view-register/view-register.component';
import { ViewContactComponent } from './view-contact/view-contact.component';
import { IncomeDetailsComponent } from './income-details/income-details.component';
import { ExpensesDetailsComponent } from './expenses-details/expenses-details.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'aboutUs',component:AboutUsComponent},
    {path:'register',component:RegisterComponent},
    {path:'login',component:LoginComponent},
    {path:'adminlogin',component:AdminLoginComponent},
    {path:'feedback',component:FeedbackComponent},
    {path:'viewfeedback',component:ViewFeedbackComponent},
    {path:'contactus',component:ContactUsComponent},
    {path:'viewregister',component:ViewRegisterComponent},
    {path:'viewcontactus',component:ViewContactComponent},
    {path:'incomedetails',component:IncomeDetailsComponent},
    {path:'expensesdetails',component:ExpensesDetailsComponent}

    
];
