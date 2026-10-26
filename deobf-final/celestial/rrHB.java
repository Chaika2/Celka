package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHB extends rrli_3 {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   private static void byte_() {
      break_ = new boolean[]{true, false, false, true, true, true, true, false, false, false, false, true, false, true, false, true, false, true, false, false};
   }

   public rrHB(GuiMove var1) {
      super(var1);
      this.protected_();
      ArrayList var6 = new ArrayList();
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @EventTarget(
      id_class = -200
   )
   public void class_(q_1 var1) {
      this.protected_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)this.class_[2] > 0) {
            Integer var6 = (Integer)this.class_[2] - 1;
            this.class_[2] = var6;
         }

         if (rrfj_3.catch_()) {
            Integer var7 = 3;
            this.class_[2] = var7;
         }

         if ((Boolean)this.class_[1]) {
            ((cb_3)import_.class_[57]).c_(false);
            C_throws.byte_().int_().class_();
            ((rqr_3)((cb_3)import_.class_[57]).break_[17]).break_(false);
         }

         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            this.break_();
         }
      } else if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]
         && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         this.break_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8314672339763072991L;
   }

   public boolean class_() {
      this.protected_();
      return !this.class_[1] && ((List)this.class_[0]).isEmpty() ? true : break_[16];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1697101632;
   }

   @EventTarget
   public void class_(rrLY var1) {
      this.protected_();
      if (!((List)this.class_[0]).isEmpty()) {
         Boolean var6 = true;
         this.class_[1] = var6;
      }
   }

   private boolean class_(rmt_3 var1) {
      this.protected_();
      if (var1.break_() != 0) {
         return false;
      } else if ((Integer)this.class_[2] != 0 && !((cb_3)import_.class_[57]).Sy()) {
         return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               && var1.case_().break_() == rdy_3.Gu
               && var1.protected_() == 1
            ? false
            : break_[13];
      } else {
         return break_[10];
      }
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.protected_();
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rmt_3 var3) {
         if (this.class_(var3)) {
            ((List)this.class_[0]).add(var3);
            var1.class_(true);
         } else if (!((List)this.class_[0]).isEmpty()) {
            this.case_();
         }
      } else if (var2 instanceof rmj_3 && !((List)this.class_[0]).isEmpty()) {
         Boolean var8 = true;
         this.class_[1] = var8;
         var1.class_(true);
      }
   }

   private void break_() {
      this.protected_();
      if ((Boolean)this.class_[1] && !((cb_3)import_.class_[57]).X()) {
         this.case_();
         Boolean var5 = false;
         this.class_[1] = var5;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{90, 24, 95, 70, 18, 36, -104, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new short[]{0, 0, 2, 2, 2, 2, 1, 57, 57, 17, 1, 2, 1, 1, 2, 0, 1, 0, 0, 0, 1, 1, 2, 2, 57, 1, 2, 1, 57, 1, 0, 0, 57, 0, 0, 1, 0};
   }

   private void case_() {
      this.protected_();
      if (!((List)this.class_[0]).isEmpty()) {
         for (rmt_3 var2 : (List)this.class_[0]) {
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(var2);
         }

         ((List)this.class_[0]).clear();
      }
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[1] = false;
         this.class_[2] = 0;
      }
   }

   private static void private_() {
      byte_ = new byte[]{3, 3, 2};
   }

   @Override
   public boolean aK_() {
      this.protected_();
      this.case_();
      Boolean var5 = false;
      this.class_[1] = var5;
      Integer var6 = 0;
      this.class_[2] = var6;
      return super.aK_();
   }
}
