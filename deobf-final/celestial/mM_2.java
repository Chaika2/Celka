package celestial;

class mM_2 extends mO_2 {
   public mM_2(int var1, int var2, rkw_3<?> var3, boolean var4, boolean var5) {
      super((int)var1, var2, var3, (boolean)var4, var5);
   }

   @Override
   protected void class_(rkw_3<?> var1) {
      rdn_3[] var2 = var1.class_().get(0).class_();
      this.class_.add(new mh_3(this, 10, 10, var2));
   }
}
