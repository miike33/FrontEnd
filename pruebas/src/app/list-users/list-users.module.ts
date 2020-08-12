import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ListUsersPageRoutingModule } from './list-users-routing.module';

import { ListUsersPage } from './list-users.page';
import { UsersFilterPipe } from '../pipes/users-filter.pipe';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ListUsersPageRoutingModule
  ],
  declarations: [ListUsersPage, UsersFilterPipe]
})
export class ListUsersPageModule {}
