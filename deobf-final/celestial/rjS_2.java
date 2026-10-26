package celestial;

public enum rjS_2 implements rjE_2 {
   COLLIDER(JC::break_),
   OUTLINE(JC::class_),
   VISUAL(JC::byte_);

   private final rjE_2 provider;

   private rjS_2(rjE_2 var3) {
      this.provider = var3;
   }

   @Override
   public rjC_2 get(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.provider.get(var1, var2, var3, var4);
   }
}
