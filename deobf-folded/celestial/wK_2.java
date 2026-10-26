package celestial;

public class wK_2 implements rrGt_1 {
   protected int[] id_class;
   protected final int id_break;
   protected rpr_3 id_byte;
   protected fj_3 id_protected;
   private final boolean id_throws;
   private int[] id_case = null;
   private rrJt_1 id_catch;
   private boolean id_private;
   private wK_2 id_implements;
   private rrxv_3 id_finally;
   private final boolean id_extends;

   public int id_byte() {
      return this.id_break;
   }

   public wK_2 id_int() {
      if (this.id_private) {
         return this.id_implements;
      } else {
         if (this.id_implements == null && this.id_protected != null && this.id_protected.id_final != null) {
            this.id_implements = new rrJl_1(this, this.id_protected.id_final);
         }

         this.id_private = true;
         return this.id_implements;
      }
   }

   public wK_2(int[] var1, int var2, rpr_3 var3, fj_3 var4, boolean var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_extends = var2 != -1;
      this.id_private();
   }

   @Override
   public String toString() {
      return "vertexData: " + this.id_class.length + ", tint: " + this.id_break + ", facing: " + this.id_byte + ", sprite: " + this.id_protected;
   }

   @Override
   public void id_class(rrGT var1) {
      rrxr_3.id_class(rrxr_3.BX, var1, this);
   }

   private static int[] id_class(int[] var0, fj_3 var1) {
      int[] var2 = (int[])var0.clone();
      int var3 = var2.length / 4;

      for (int var4 = 0; var4 < 4; var4++) {
         int var5 = var4 * var3;
         float var6 = Float.intBitsToFloat(var2[var5 + 4]);
         float var7 = Float.intBitsToFloat(var2[var5 + 4 + 1]);
         float var8 = var1.id_byte(var6);
         float var9 = var1.id_protected(var7);
         var2[var5 + 4] = Float.floatToRawIntBits(var8);
         var2[var5 + 4 + 1] = Float.floatToRawIntBits(var9);
      }

      return var2;
   }

   public int[] id_class() {
      this.id_private();
      return this.id_class;
   }

   private static fj_3 id_class(int[] var0) {
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 0.0F;
      float var4 = 0.0F;
      int var5 = var0.length / 4;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var6 * var5;
         float var8 = Float.intBitsToFloat(var0[var7 + 4]);
         float var9 = Float.intBitsToFloat(var0[var7 + 4 + 1]);
         var1 = Math.min(var1, var8);
         var2 = Math.min(var2, var9);
         var3 = Math.max(var3, var8);
         var4 = Math.max(var4, var9);
      }

      float var10 = (var1 + var3) / 2.0F;
      float var11 = (var2 + var4) / 2.0F;
      return rrbb_3.rF().id_class((double)var10, (double)var11);
   }

   public rrxq_3[] id_class(int var1) {
      if (this.id_finally == null) {
         this.id_finally = new rrxv_3();
      }

      return this.id_finally.id_class(var1);
   }

   private static int[] id_class(int[] var0, int var1) {
      int var2 = var0.length / 4;
      int var3 = var1 / 4;
      int[] var4 = new int[var3 * 4];

      for (int var5 = 0; var5 < 4; var5++) {
         int var6 = Math.min(var2, var3);
         System.arraycopy(var0, var5 * var2, var4, var5 * var3, var6);
      }

      return var4;
   }

   public boolean id_break() {
      return this.id_extends;
   }

   public boolean id_throws() {
      return this.id_throws;
   }

   public float id_finally() {
      rrJt_1 var1 = this.id_implements();
      return (var1.id_protected() + var1.id_class()) / 2.0F;
   }

   public int[] id_catch() {
      if (this.id_case == null) {
         this.id_case = id_class(this.id_class(), this.id_case());
      }

      if (this.id_case.length != this.id_class().length) {
         this.id_case = id_class(this.id_class(), this.id_case());
      }

      return this.id_case;
   }

   public double id_extends() {
      rrJt_1 var1 = this.id_implements();
      return (double)((var1.id_throws() + var1.id_break()) / 2.0F);
   }

   public fj_3 id_case() {
      if (this.id_protected == null) {
         this.id_protected = id_class(this.id_class());
      }

      return this.id_protected;
   }

   public rrJt_1 id_implements() {
      if (this.id_catch == null) {
         this.id_catch = new rrJt_1(this.id_class());
      }

      return this.id_catch;
   }

   public boolean id_package() {
      return this.id_final() && this.id_volatile();
   }

   public rpr_3 id_protected() {
      if (this.id_byte == null) {
         this.id_byte = Ih_1.id_class(this.id_class());
      }

      return this.id_byte;
   }

   protected void id_private() {
      if (rrbb_3.rs()) {
         if (this.id_class.length == ju_3.id_native) {
            this.id_class = id_class(this.id_class, ju_3.id_volatile);
         }
      } else if (this.id_class.length == ju_3.id_volatile) {
         this.id_class = id_class(this.id_class, ju_3.id_native);
      }
   }

   public boolean id_final() {
      rrJt_1 var1 = this.id_implements();
      return var1.id_break(this.id_byte);
   }

   public boolean id_volatile() {
      rrJt_1 var1 = this.id_implements();
      return var1.id_class(this.id_byte);
   }

   public double id_native() {
      rrJt_1 var1 = this.id_implements();
      return (double)((var1.id_case() + var1.id_byte()) / 2.0F);
   }
}
