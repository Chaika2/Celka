package celestial;

public enum rGT {
   NONE(0, 0.0, 0.0, 0.0),
   SUMMON_VEX(1, 0.7, 0.7, 0.8),
   FANGS(2, 0.4, 0.3, 0.35),
   WOLOLO(3, 0.7, 0.5, 0.2),
   DISAPPEAR(4, 0.3, 0.3, 0.8),
   BLINDNESS(5, 0.1, 0.1, 0.2);

   final int id;
   final double[] particleSpeed;

   private rGT(int var3, double var4, double var6, double var8) {
      this.id = var3;
      this.particleSpeed = new double[]{var4, var6, var8};
   }

   public static rGT id_class(int var0) {
      for (rGT var4 : values()) {
         if (var0 == var4.id) {
            return var4;
         }
      }

      return NONE;
   }
}
