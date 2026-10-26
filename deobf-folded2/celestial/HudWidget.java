package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HudWidget extends rrvR_1 {
   private static boolean[] id_native;
   private static byte[] id_volatile;
   private static float[] id_final;
   private static short[] id_package;
   public Object[] id_protected;
   private static String[] id_int;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, 52, 79, -54, -56, -45, 75, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public HudWidget() {
      super("Staff Viewer", new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.B();
      rrFZ var5 = new rrFZ(this);
      this.id_protected[0] = var5;
      Float var6 = this.S();
      this.id_protected[1] = var6;
      this.id_try().id_class((Float)this.id_protected[1]);
   }

   static {
      ntfClinit();
   }

   private void B() {
      if (this.id_protected == null) {
         this.id_protected = new Object[2];
         Object[] var1 = this.id_protected;
         var1[1] = 0.0F;
      }
   }

   private float S() {
      this.B();
      boolean var1 = false;
      int var2 = 0;

      for (rrqr_3 var4 : ((rrFZ)this.id_protected[0]).id_byte()) {
         int var5 = (int)((rrFZ)this.id_protected[0]).id_class(var4);
         if (!var1 || var5 > var2) {
            var1 = id_native[10];
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : id_final[3];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class().id_break(this.id_byte()) + 47.0F, var6);
   }

   private static void s() {
      id_int = new String[]{new String("Staff Viewer")};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -281692866;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      float var8 = this.id_implements();
      float var9 = this.ao_();
      rrvg_1.id_class(this, var1, () -> {
         this.B();
         rrfi_3.id_break();
         rrfD_2.id_protected(var1, var6, var7 + 12.5F, var8, var9, -1);
         rrfi_3.id_class(1);
         ((rrFZ)this.id_protected[0]).id_class(var1, var6, var7);
         rrfi_3.id_class();
      });
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6629523933158757609L;
   }

   private static void M() {
      id_volatile = new byte[]{-1, 2};
   }

   private static void G() {
      id_package = new short[]{0, 1, 1, 0, 73, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public float id_goto() {
      this.B();
      return (Float)this.id_protected[1];
   }

   @Override
   public void id_instanceof() {
      this.B();
      super.id_instanceof();
      this.id_break(!((rrFZ)this.id_protected[0]).id_class() && (vm_3)id_import.id_class[73] instanceof FP ? true : id_native[3]);
      Float var5 = this.S();
      this.id_protected[1] = var5;
      ((rrFZ)this.id_protected[0]).id_throws();
   }

   @Override
   public boolean id_package() {
      this.B();
      StaffViewer var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().o();
      if (!var1.aJ_()) {
         return id_native[6];
      } else {
         return !this.id_super() && !((rrFZ)this.id_protected[0]).id_class() ? id_native[5] : id_native[4];
      }
   }

   private static void id_throw() {
      id_native = new boolean[]{true, true, true, false, true, false, false, false, false, false, true, true, true};
   }

   @Override
   public float id_while() {
      this.B();
      return ((rrFZ)this.id_protected[0]).id_finally() - 2.0F;
   }

   @Override
   public boolean id_protected() {
      return false;
   }

   private static void E() {
      id_final = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 47.0F, 12.5F, 0.0F};
   }

   @Override
   public float ao_() {
      return this.id_while();
   }
}
