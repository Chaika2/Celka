package celestial;

class rrrP extends rrrM {
   rrrP(Class var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean class_(int var1) {
      return super.class_(var1) && var1 > 5;
   }
}
