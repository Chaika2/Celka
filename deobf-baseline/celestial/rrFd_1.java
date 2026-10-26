package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFd_1 extends rrvR_1 {
   private static short[] id_native;
   private static String[] id_volatile;
   private static boolean[] id_final;
   public Object[] id_protected;
   private static float[] id_package;
   private static byte[] id_int;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, -89, -64, 116, -91, -5, -89, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFd_1() {
      super(id_volatile[0], new AnimValue(id_package[0], id_final[0]), new AnimValue(id_package[1], id_final[1]));
      this.E();
      rrFk_1 var5 = new rrFk_1(this);
      this.id_protected[id_native[0]] = var5;
      Float var6 = this.M();
      this.id_protected[id_native[1]] = var6;
      this.id_try().id_class((Float)this.id_protected[id_native[2]]);
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_volatile = new String[]{new String("Potions")};
   }

   private static void S() {
      id_native = new short[]{0, 1, 1, 0, 0, 73, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   private static void s() {
      id_final = new boolean[]{true, true, true, false, true, false, false, false, false, false, true, true, true};
   }

   private static void h() {
      id_package = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 70.0F, 12.5F, 0.0F};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1131286600;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 982607933608022961L;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      float var8 = this.id_implements();
      float var9 = this.ao_();
      rrvg_1.id_class(this, var1, () -> {
         this.E();
         rrfi_3.id_break();
         rrfD_2.id_protected(var1, var6, var7 + id_package[5], var8, var9, id_int[0]);
         rrfi_3.id_class(id_final[11]);
         ((rrFk_1)this.id_protected[id_native[16]]).id_class(var1, var6, var7);
         rrfi_3.id_class();
      });
   }

   private float M() {
      this.E();
      boolean var1 = id_final[8];
      int var2 = id_final[9];

      for (rrFz_1 var4 : ((rrFk_1)this.id_protected[id_native[12]]).id_class()) {
         int var5 = (int)((rrFk_1)this.id_protected[id_native[13]]).id_class(var4);
         if (!var1 || var5 > var2) {
            var1 = id_final[10];
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : id_package[3];
      return Math.max(
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[14]]).id_class().id_break(this.id_byte()) + id_package[4], var6
      );
   }

   private static void G() {
      id_int = new byte[]{-1, 2};
   }

   @Override
   public float id_goto() {
      this.E();
      return (Float)this.id_protected[id_native[10]];
   }

   @Override
   public void id_instanceof() {
      this.E();
      super.id_instanceof();
      this.id_break(!((rrFk_1)this.id_protected[id_native[4]]).id_private() && (vm_3)id_import.id_class[id_native[5]] instanceof FP ? id_final[2] : id_final[3]);
      Float var5 = this.M();
      this.id_protected[id_native[6]] = var5;
      ((rrFk_1)this.id_protected[id_native[7]]).id_throws();
   }

   @Override
   public boolean id_package() {
      this.E();
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[8]]).id_private().w();
      if (var1.aJ_() && var1.id_this() && var1.id_throw()) {
         return !this.id_super() && !((rrFk_1)this.id_protected[id_native[9]]).id_private() ? id_final[5] : id_final[4];
      } else {
         return id_final[6];
      }
   }

   public rrFk_1 id_throw() {
      this.E();
      return (rrFk_1)this.id_protected[id_native[15]];
   }

   @Override
   public float id_while() {
      this.E();
      return ((rrFk_1)this.id_protected[id_native[11]]).id_finally() - id_package[2];
   }

   @Override
   public boolean id_protected() {
      return id_final[7];
   }

   private void E() {
      if (this.id_protected == null) {
         this.id_protected = new Object[id_int[1]];
         Object[] var1 = this.id_protected;
         var1[id_final[12]] = id_package[6];
      }
   }

   @Override
   public void as_() {
      this.E();
      super.as_();
      ((rrFk_1)this.id_protected[id_native[3]]).id_catch();
   }

   @Override
   public float ao_() {
      return this.id_while();
   }
}
