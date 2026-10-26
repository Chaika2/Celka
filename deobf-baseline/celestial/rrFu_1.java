package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFu_1 extends rrvR_1 {
   public Object[] id_protected;
   private static byte[] id_native;
   private static short[] id_volatile;
   private static String[] id_final;
   private static boolean[] id_package;
   private static float[] id_int;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 108, 92, 122, -94, -5, 39, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFu_1() {
      super(id_final[0], new AnimValue(id_int[0], id_package[0]), new AnimValue(id_int[1], id_package[1]));
      this.id_throw();
      rrFm_1 var5 = new rrFm_1(this);
      this.id_protected[id_volatile[0]] = var5;
      Float var6 = this.E();
      this.id_protected[id_volatile[1]] = var6;
      this.id_try().id_class((Float)this.id_protected[id_volatile[2]]);
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_final = new String[]{new String("Schedules")};
   }

   private static void S() {
      id_native = new byte[]{2};
   }

   private static void s() {
      id_int = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 70.0F, 0.0F};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1893052533;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      rrvg_1.id_class(this, var1, () -> {
         this.id_throw();
         ((rrFm_1)this.id_protected[id_volatile[11]]).id_class(var1, var6, var7);
      });
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4732958983921704167L;
   }

   private static void M() {
      id_package = new boolean[]{true, true, true, false, false, false, false, true, true};
   }

   private static void G() {
      id_volatile = new short[]{0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0};
   }

   @Override
   public float id_goto() {
      this.id_throw();
      return (Float)this.id_protected[id_volatile[6]];
   }

   @Override
   public void id_instanceof() {
      this.id_throw();
      super.id_instanceof();
      Float var5 = this.E();
      this.id_protected[id_volatile[3]] = var5;
      ((rrFm_1)this.id_protected[id_volatile[4]]).id_throws();
   }

   @Override
   public boolean id_package() {
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_volatile[5]]).id_private().w();
      return var1.aJ_() && var1.id_super() ? id_package[2] : id_package[3];
   }

   private void id_throw() {
      if (this.id_protected == null) {
         this.id_protected = new Object[id_native[0]];
         Object[] var1 = this.id_protected;
         var1[id_package[8]] = id_int[5];
      }
   }

   @Override
   public float id_while() {
      this.id_throw();
      return ((rrFm_1)this.id_protected[id_volatile[7]]).id_finally() - id_int[2];
   }

   @Override
   public boolean id_protected() {
      return id_package[4];
   }

   private float E() {
      this.id_throw();
      boolean var1 = id_package[5];
      int var2 = id_package[6];

      for (List var4 : ((rrFm_1)this.id_protected[id_volatile[8]]).id_break().values()) {
         for (rrTB var6 : var4) {
            int var7 = (int)((rrFm_1)this.id_protected[id_volatile[9]]).id_class(var6);
            if (!var1 || var7 > var2) {
               var1 = id_package[7];
               var2 = var7;
            }
         }
      }

      float var8 = var1 ? (float)var2 : id_int[3];
      return Math.max(
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_volatile[10]]).id_finally().id_break(this.id_byte()) + id_int[4], var8
      );
   }
}
