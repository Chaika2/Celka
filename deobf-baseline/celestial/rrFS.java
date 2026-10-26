package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFS extends rrvR_1 {
   private static byte[] id_native;
   private static float[] id_volatile;
   private static short[] id_final;
   private static String[] id_package;
   public Object[] id_protected;
   private static boolean[] id_int;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 46, -128, -94, 14, 39, 13, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFS() {
      super(id_package[0], new AnimValue(id_volatile[0], id_int[0]), new AnimValue(id_volatile[1], id_int[1]));
      this.M();
      rrFs_1 var5 = new rrFs_1(this);
      this.id_protected[id_final[0]] = var5;
      Float var6 = this.E();
      this.id_protected[id_final[1]] = var6;
      this.id_try().id_class(this.id_goto());
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_package = new String[]{new String("Keybinds")};
   }

   private static void S() {
      id_int = new boolean[]{true, true, true, false, true, false, false, false, false, false, true, true, true};
   }

   private static void s() {
      id_native = new byte[]{-1, 2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7544726781679561298L;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      float var8 = this.id_implements();
      float var9 = this.ao_();
      rrvg_1.id_class(this, var1, () -> {
         this.M();
         rrfi_3.id_break();
         rrfD_2.id_protected(var1, var6, var7 + id_volatile[5], var8, var9, id_native[0]);
         rrfi_3.id_class(id_int[11]);
         ((rrFs_1)this.id_protected[id_final[13]]).id_class(var1, var6, var7);
         rrfi_3.id_class();
      });
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1999908848;
   }

   private void M() {
      if (this.id_protected == null) {
         this.id_protected = new Object[id_native[1]];
         Object[] var1 = this.id_protected;
         var1[id_int[12]] = id_volatile[6];
      }
   }

   private static void G() {
      id_volatile = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 47.0F, 12.5F, 0.0F};
   }

   @Override
   public float id_goto() {
      this.M();
      return (Float)this.id_protected[id_final[8]];
   }

   @Override
   public void id_instanceof() {
      this.M();
      super.id_instanceof();
      this.id_break(!((rrFs_1)this.id_protected[id_final[2]]).id_break() && (vm_3)id_import.id_class[id_final[3]] instanceof FP ? id_int[2] : id_int[3]);
      Float var5 = this.E();
      this.id_protected[id_final[4]] = var5;
      ((rrFs_1)this.id_protected[id_final[5]]).id_throws();
   }

   @Override
   public boolean id_package() {
      this.M();
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_final[6]]).id_private().w();
      if (var1.aJ_() && var1.id_try()) {
         return !this.id_super() && !((rrFs_1)this.id_protected[id_final[7]]).id_break() ? id_int[5] : id_int[4];
      } else {
         return id_int[6];
      }
   }

   private static void id_throw() {
      id_final = new short[]{0, 1, 0, 73, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0};
   }

   @Override
   public float id_while() {
      this.M();
      return ((rrFs_1)this.id_protected[id_final[9]]).id_finally() - id_volatile[2];
   }

   @Override
   public boolean id_protected() {
      return id_int[7];
   }

   private float E() {
      this.M();
      boolean var1 = id_int[8];
      int var2 = id_int[9];

      for (rrFE var4 : ((rrFs_1)this.id_protected[id_final[10]]).id_class()) {
         int var5 = (int)((rrFs_1)this.id_protected[id_final[11]]).id_class(var4);
         if (!var1 || var5 > var2) {
            var1 = id_int[10];
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : id_volatile[3];
      return Math.max(
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_final[12]]).id_class().id_break(this.id_byte()) + id_volatile[4], var6
      );
   }

   @Override
   public float ao_() {
      return this.id_while();
   }
}
