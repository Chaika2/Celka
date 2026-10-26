package celestial;

public final class rjL_2 extends rjp_3 {
   private final rjp_3 id_protected;
   private final int id_throws;
   private final int id_case;
   private final int id_catch;
   private final int id_private;
   private final int id_implements;
   private final int id_finally;

   protected rjL_2(rjp_3 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5 - var2, var6 - var3, var7 - var4);
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
      this.id_private = var5;
      this.id_implements = var6;
      this.id_finally = var7;
   }

   @Override
   public int id_class(rpB_2 var1) {
      return Math.max(0, this.id_protected.id_class(var1) - var1.id_class(this.id_throws, this.id_case, this.id_catch));
   }

   @Override
   public void id_class(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.id_protected.id_class(this.id_throws + var1, this.id_case + var2, this.id_catch + var3, var4, var5);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return this.id_protected.id_break(this.id_throws + var1, this.id_case + var2, this.id_catch + var3);
   }

   @Override
   public int id_break(rpB_2 var1) {
      return Math.min(
         var1.id_class(this.id_private, this.id_implements, this.id_finally),
         this.id_protected.id_break(var1) - var1.id_class(this.id_throws, this.id_case, this.id_catch)
      );
   }
}
