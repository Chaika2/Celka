package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvo_1 extends rrvR_1 {
   private static boolean[] id_native;
   private static byte[] id_volatile;
   private static String[] id_final;
   private static short[] id_package;
   private static float[] id_int;
   public Object[] id_protected;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 55, -61, 50, 88, -94, 34, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrvo_1() {
      super(id_final[0], new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.E();
      rrvK var5 = new rrvK(this);
      this.id_protected[id_package[0]] = var5;
      Float var6 = this.B();
      this.id_protected[1] = var6;
      this.id_try().id_class((Float)this.id_protected[1]);
   }

   static {
      ntfClinit();
   }

   private float B() {
      this.E();
      boolean var1 = id_native[8];
      int var2 = id_native[9];

      for (rrvU var4 : ((rrvK)this.id_protected[id_package[11]]).id_class()) {
         int var5 = (int)((rrvK)this.id_protected[id_package[12]]).id_class(var4);
         if (!var1 || var5 > var2) {
            var1 = true;
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : id_int[3];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[13]]).id_class().id_break(this.id_byte()) + 57.0F, var6);
   }

   private static void S() {
      id_int = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 57.0F, 12.5F, 0.0F};
   }

   private static void s() {
      id_native = new boolean[]{true, true, true, false, true, false, false, false, false, false, true, true, true};
   }

   private static void h() {
      id_final = new String[]{new String("Cooldowns")};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1159162956;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6415805623210434491L;
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
         rrfD_2.id_protected(var1, var6, var7 + 12.5F, var8, var9, -1);
         rrfi_3.id_class(1);
         ((rrvK)this.id_protected[id_package[15]]).id_class(var1, var6, var7);
         rrfi_3.id_class();
      });
   }

   private static void M() {
      id_volatile = new byte[]{-1, 2};
   }

   private static void G() {
      id_package = new short[]{0, 1, 1, 0, 73, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public float id_goto() {
      this.E();
      return (Float)this.id_protected[1];
   }

   @Override
   public void id_instanceof() {
      this.E();
      super.id_instanceof();
      this.id_break(!((rrvK)this.id_protected[id_package[3]]).id_case() && (vm_3)id_import.id_class[73] instanceof FP ? true : id_native[3]);
      Float var5 = this.B();
      this.id_protected[1] = var5;
      ((rrvK)this.id_protected[id_package[6]]).id_throws();
   }

   @Override
   public boolean id_package() {
      this.E();
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_package[7]]).id_private().w();
      if (var1.aJ_() && var1.id_return()) {
         return !this.id_super() && !((rrvK)this.id_protected[id_package[8]]).id_case() ? id_native[5] : true;
      } else {
         return id_native[6];
      }
   }

   public rrvK id_throw() {
      this.E();
      return (rrvK)this.id_protected[id_package[14]];
   }

   @Override
   public float id_while() {
      this.E();
      return ((rrvK)this.id_protected[id_package[10]]).id_finally() - 2.0F;
   }

   @Override
   public boolean id_protected() {
      return id_native[7];
   }

   private void E() {
      if (this.id_protected == null) {
         this.id_protected = new Object[2];
         Object[] var1 = this.id_protected;
         var1[1] = id_int[6];
      }
   }

   @Override
   public float ao_() {
      return this.id_while();
   }
}
