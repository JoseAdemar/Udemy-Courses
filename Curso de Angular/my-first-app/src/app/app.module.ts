import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ServerComponent } from './server/server.component';
import { ServersComponent } from './servers/servers.component';
import { successAlertComponent } from './success-alert/success-alert.component';
import { WarningAlertCompoent } from './warning-alert/warning-alert.component';
import { DatabindingExercicioComponent } from './exercicios/databinding-exercicio/databinding-exercicio.component';

@NgModule({
  declarations: [
    AppComponent,
    ServerComponent,
    ServersComponent,
    WarningAlertCompoent,
    successAlertComponent,
    DatabindingExercicioComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
