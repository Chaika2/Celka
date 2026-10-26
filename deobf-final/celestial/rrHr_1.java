package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHr_1 extends rrli_3 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[1] = false;
         this.class_[2] = 0;
         this.class_[3] = 0;
         this.class_[4] = false;
         this.class_[5] = false;
      }
   }

   public rrHr_1(GuiMove var1) {
      super(var1);
      this.byte_();
      ArrayList var6 = new ArrayList();
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6767043204642929827L;
   }

   @EventTarget
   public void class_(rrAO var1) {
      this.byte_();
      if ((Boolean)this.class_[4] && C_throws.byte_().return_().class_() && var1.private_()) {
         this.case_();
         this.class_(false);
         Boolean var6 = false;
         this.class_[4] = var6;
      }
   }

   private void class_(boolean var1) {
      this.byte_();
      if (C_throws.byte_().return_().class_()) {
         Boolean var6 = true;
         this.class_[5] = var6;
         if (var1) {
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmj_3(0));
         } else {
            ((cb_3)import_.class_[57]).strictfp_();
         }

         Boolean var7 = false;
         this.class_[5] = var7;
      }
   }

   public boolean class_() {
      this.byte_();
      return !this.class_[1] && ((List)this.class_[0]).isEmpty() ? true : protected_[28];
   }

   @EventTarget
   public void class_(rrLY var1) {
      this.byte_();
      if (!((List)this.class_[0]).isEmpty()) {
         Boolean var6 = true;
         this.class_[1] = var6;
      }
   }

   @EventTarget(
      id_class = -200
   )
   public void class_(q_1 var1) {
      this.byte_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)this.class_[3] > 0) {
            Integer var6 = (Integer)this.class_[3] - 1;
            this.class_[3] = var6;
         }

         if (rrfj_3.catch_()) {
            Integer var7 = 3;
            this.class_[3] = var7;
         }

         if ((Boolean)this.class_[1]) {
            ((cb_3)import_.class_[57]).c_(false);
            C_throws.byte_().int_().class_();
            ((rqr_3)((cb_3)import_.class_[57]).break_[17]).break_(false);
            int var10002 = (Integer)this.class_[2] + 1;
            Integer var8 = var10002;
            this.class_[2] = var8;
            if (var10002 > 1 && !((cb_3)import_.class_[57]).X()) {
               this.throws_();
               Integer var9 = 0;
               this.class_[2] = var9;
               Boolean var10 = false;
               this.class_[1] = var10;
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2099853627;
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.byte_();
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rmt_3 var3) {
         rrHP var5 = this.break_(var3.break_());
         if (var5 == (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[2]) {
            ((List)this.class_[0]).add(var3);
            var1.class_(true);
         } else {
            if (var5 == (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[1]) {
               Boolean var10 = true;
               this.class_[4] = var10;
            }

            if (!((List)this.class_[0]).isEmpty()) {
               this.throws_();
            }
         }
      } else if (var2 instanceof rmj_3 var4 && !(Boolean)this.class_[5]) {
         rrHP var12 = this.break_(var4.break_());
         if (var12 == (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[2]) {
            ((List)this.class_[0]).add(var2);
            Boolean var11 = true;
            this.class_[1] = var11;
            var1.class_(true);
         }
      }
   }

   @Override
   public boolean class_(vm_3 var1) {
      if (super.class_(var1)) {
         return true;
      } else {
         return (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] && rrfo_3.class_() ? true : protected_[16];
      }
   }

   private static void break_() {
      break_ = new byte[]{3, -1, 6, 2, 3, 4, 5};
   }

   private rrHP break_(int var1) {
      this.byte_();
      if (var1 != 0) {
         return (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[0];
      } else {
         return this.class_[3] == 0 && ((List)this.class_[0]).isEmpty()
            ? (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[1]
            : (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[2];
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, -43, 14, -50, 97, -35, -103, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void throws_() {
      this.byte_();
      if (!((List)this.class_[0]).isEmpty()) {
         for (ruS_2 var2 : (List)this.class_[0]) {
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(var2);
         }

         ((List)this.class_[0]).clear();
         this.class_(true);
      }
   }

   private void case_() {
      rdn_3 var1 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).finally_();
      if (!var1.class_()) {
         int var2 = rrfY_2.class_();
         if (var2 != -1) {
            ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, rrfY_2.break_(var2), 0, rXa_1.PICKUP, false);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         }
      }
   }

   private static void protected_() {
      byte_ = new short[]{
         0,
         0,
         3,
         3,
         3,
         3,
         1,
         57,
         57,
         17,
         2,
         2,
         57,
         2,
         1,
         0,
         1,
         4,
         4,
         2,
         0,
         1,
         4,
         0,
         5,
         2,
         0,
         1,
         1,
         4,
         1,
         4,
         2,
         3,
         0,
         3,
         0,
         1,
         2,
         0,
         0,
         57,
         0,
         0,
         57,
         1,
         55,
         57,
         4,
         0,
         5,
         57,
         0,
         57,
         5,
         1,
         0
      };
   }

   private static void private_() {
      protected_ = new boolean[]{
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   @Override
   public boolean aK_() {
      this.byte_();
      this.throws_();
      Boolean var5 = false;
      this.class_[1] = var5;
      Boolean var6 = false;
      this.class_[4] = var6;
      Integer var7 = 0;
      this.class_[2] = var7;
      Integer var8 = 0;
      this.class_[3] = var8;
      return super.aK_();
   }
}
