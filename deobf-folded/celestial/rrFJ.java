package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFJ extends rrvR_1 {
   private static String[] id_native;
   private static float[] id_volatile;
   public Object[] id_protected;
   private static short[] id_final;
   private static boolean[] id_package;
   private static byte[] id_int;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, 90, 104, -118, 125, -106, -124, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFJ() {
      super(id_native[0], new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.s();
      rrFO var5 = new rrFO(this);
      this.id_protected[id_final[0]] = var5;
      this.id_try().id_class(this.id_goto());
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_package = new boolean[]{true, true, true, false, false, false, false, true, false, true, true};
   }

   private static void S() {
      id_volatile = new float[]{0.5F, 0.5F, 0.0F, 50.0F, 2.0F, 13.0F};
   }

   private void s() {
      if (this.id_protected == null) {
         this.id_protected = new Object[1];
         Object[] var1 = this.id_protected;
      }
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      float var8 = this.id_implements();
      float var9 = this.ao_();
      rrvg_1.id_class(this, var1, () -> {
         this.s();
         rrfi_3.id_break();
         rrfD_2.id_protected(var1, var6, var7 + 13.0F, var8, var9, -1);
         rrfi_3.id_class(1);
         ((rrFO)this.id_protected[id_final[10]]).id_class(var1, var6, var7);
         rrfi_3.id_class();
      });
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 360793264;
   }

   public void id_class(rrFK var1) {
      this.s();
      ((rrFO)this.id_protected[id_final[3]]).id_class(var1);
   }

   public void id_class(rrLf_1 var1) {
      this.s();
      ((rrFO)this.id_protected[id_final[1]]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -585551402968958234L;
   }

   public void id_class(rrAM var1) {
      this.s();
      ((rrFO)this.id_protected[id_final[2]]).id_class(var1);
   }

   private static void M() {
      id_int = new byte[]{-1};
   }

   private static void G() {
      id_native = new String[]{new String("Pickup Viewer")};
   }

   @Override
   public float id_goto() {
      this.s();
      boolean var1 = id_package[5];
      int var2 = id_package[6];

      for (rrFX var4 : ((rrFO)this.id_protected[id_final[6]]).id_break()) {
         int var5 = (int)((rrFO)this.id_protected[id_final[7]]).id_class(var4);
         if (!var1 || var5 > var2) {
            var1 = true;
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : id_volatile[2];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_final[8]]).id_finally().id_break(this.id_byte()) + 50.0F, var6);
   }

   @Override
   public void id_instanceof() {
      this.s();
      super.id_instanceof();
      ((rrFO)this.id_protected[id_final[4]]).id_throws();
   }

   @Override
   public boolean id_package() {
      this.s();
      return this.id_throw() && !((rrFO)this.id_protected[id_final[5]]).id_break().isEmpty() ? true : id_package[3];
   }

   public boolean id_throw() {
      return id_package[4];
   }

   @Override
   public float id_while() {
      this.s();
      return ((rrFO)this.id_protected[id_final[9]]).id_finally() - 2.0F;
   }

   @Override
   public boolean id_protected() {
      return id_package[8];
   }

   private static void E() {
      id_final = new short[11];
   }

   @Override
   public float ao_() {
      return this.id_while();
   }
}
