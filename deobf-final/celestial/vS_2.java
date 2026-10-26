package celestial;

public class vS_2 extends vm_3 {
   public vS_2() {
      super(new rgN_2("Out of memory!"));
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, this.int_ / 4 - 60 + 20, 16777215);
      byte_(var1, this.super_, "Minecraft has run out of memory.", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 0, 10526880);
      byte_(var1, this.super_, "This could be caused by a bug in the game or by the", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 18, 10526880);
      byte_(var1, this.super_, "Java Virtual Machine not being allocated enough", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 27, 10526880);
      byte_(var1, this.super_, "memory.", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 36, 10526880);
      byte_(var1, this.super_, "To prevent level corruption, the current game has quit.", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 54, 10526880);
      byte_(var1, this.super_, "We've tried to free up enough memory to let you go back to", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 63, 10526880);
      byte_(
         var1, this.super_, "the main menu and back to playing, but this may not have worked.", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 72, 10526880
      );
      byte_(var1, this.super_, "Please restart the game if you see this message again.", this.package_ / 2 - 140, this.int_ / 4 - 60 + 60 + 81, 10526880);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      this.class_(new LF(this.package_ / 2 - 155, this.int_ / 4 + 120 + 12, 150, 20, new rgn_3("gui.toTitle"), var1 -> this.volatile_.break_(new rrvL())));
      this.class_(new LF(this.package_ / 2 - 155 + 160, this.int_ / 4 + 120 + 12, 150, 20, new rgn_3("menu.quit"), var1 -> this.volatile_.G()));
   }
}
