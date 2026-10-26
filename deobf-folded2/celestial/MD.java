package celestial;

@Deprecated
public enum MD {
   LINEAR(9729),
   EXP(2048),
   EXP2(2049);

   public final int param;

   private MD(int var3) {
      this.param = var3;
   }
}
