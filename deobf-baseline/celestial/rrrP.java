package celestial;

class rrrP extends rrrM {
   rrrP(Class var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean id_class(int var1) {
      return super.id_class(var1) && var1 > 5;
   }
}
