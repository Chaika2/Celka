package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCt_1 extends rrTF<Velocity> {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static String[] case_;
   private static float[] catch_;

   private static void byte_() {
      byte_ = new byte[]{2, 31, 2};
   }

   public rrCt_1(Velocity var1) {
      super(var1);
      this.case_();
      rrIm_1 var6 = new rrIm_1("Горизонтально", 50.0F, 0.0F, 100.0F, 1.0F);
      this.class_[0] = var6;
      rrIm_1 var7 = new rrIm_1("Вертикально", 50.0F, 0.0F, 100.0F, 1.0F);
      this.class_[1] = var7;
      var1.class_(
         new Setting[]{
            ((rrIm_1)this.class_[0]).class_(() -> var1.new_() == this ? true : break_[6]),
            ((rrIm_1)this.class_[1]).class_(() -> var1.new_() == this ? true : break_[4])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8052270945812747818L;
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.case_();
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rvc_3 var3) {
         if ((cb_3)import_.class_[57] != null && var3.break_() == ((cb_3)import_.class_[57]).V()) {
            var3.class_((int)((float)var3.byte_() * (((rrIm_1)this.class_[0]).byte_() / 100.0F)));
            var3.break_((int)((float)var3.protected_() * (((rrIm_1)this.class_[1]).byte_() / 100.0F)));
            var3.byte_((int)((float)var3.throws_() * (((rrIm_1)this.class_[0]).byte_() / 100.0F)));
         }
      } else if (var2 instanceof rvu_3 var4) {
         var4.class_((float)((int)(var4.break_() * (((rrIm_1)this.class_[0]).byte_() / 100.0F))));
         var4.break_((float)((int)(var4.byte_() * (((rrIm_1)this.class_[1]).byte_() / 100.0F))));
         var4.byte_((float)((int)(var4.protected_() * (((rrIm_1)this.class_[0]).byte_() / 100.0F))));
      } else if (var2 instanceof rvQ_2 var5 && var5.break_() == 31) {
         var1.class_(true);
      }
   }

   private static void class_() {
      catch_ = new float[]{50.0F, 0.0F, 100.0F, 1.0F, 50.0F, 0.0F, 100.0F, 1.0F, 100.0F, 100.0F, 100.0F, 100.0F, 100.0F, 100.0F};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 773528278;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, 77, 86, -106, 116, -74, 92, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new boolean[]{false, true, true, true, false, true, false};
   }

   private static void throws_() {
      protected_ = new short[]{0, 1, 0, 1, 57, 57, 0, 1, 0, 0, 1, 0};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   private static void protected_() {
      case_ = new String[]{new String("Горизонтально"), new String("Вертикально")};
   }
}
