import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { LogoApComponent } from './componentes/logo-ap/logo-ap.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { RedesComponent } from './componentes/redes/redes.component';
import { AcercadeComponent } from './componentes/acercade/acercade.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoApComponent,
    BannerComponent,
    RedesComponent,
    AcercadeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
