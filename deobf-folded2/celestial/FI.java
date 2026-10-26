package celestial;

public abstract class FI extends LF implements MinecraftAccessor {
   private final Fb_1<?> id_class;

   public FI(Fb_1<?> var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var1;
   }

   public boolean id_extends() {
      return true;
   }

   public abstract FM id_implements();

   public abstract void id_private();

   public Fb_1<?> id_native() {
      return this.id_class;
   }
}
