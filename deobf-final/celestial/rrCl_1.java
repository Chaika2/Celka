package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCl_1 extends rrCv_1 {
   private static byte[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static short[] protected_;
   private static String[] case_;
   private static boolean[] catch_;

   private static void byte_() {
      byte_ = new byte[]{2, -1, 9, 8, -1, 8, -1, -2, -3, 45, -1, 5, 4};
   }

   public rrCl_1(FastSwap var1) {
      super(var1);
      this.case_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.class_[0] = var6;
      rrIk_1 var7 = new rrIk_1("Только крушителя", false);
      this.class_[1] = var7;
      rrmi_3 var8 = new rrmi_3();
      this.class_[2] = var8;
      rrmi_3 var9 = new rrmi_3();
      this.class_[3] = var9;
      var1.class_(new Setting[]{new GroupSetting("Трезубец", (rrIF)this.class_[0], (rrIk_1)this.class_[1])});
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -70, 49, 60, -35, 126, 86, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_(int var1, int var2) {
      if (var1 > 8) {
         ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, var2, rXa_1.SWAP, false);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
      } else {
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var1;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 608777391;
   }

   @Override
   public rdb_3 class_() {
      return rdy_3.kY;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.case_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.class_[4]) {
         Pair var2 = this.implements_();
         rdn_3 var3 = (rdn_3)var2.getLeft();
         int var4 = (Integer)var2.getRight();
         int var5 = ((rrmi_3)this.class_[2]).class_(false);
         if (var5 != -1 && var5 < 9) {
            int var14 = ((rrmi_3)this.class_[2]).break_();
            this.class_(var14, var5);
            ((rrmi_3)this.class_[2]).throws_();
         } else if (var4 >= 0) {
            boolean var6 = var4 > 8 ? true : catch_[9];
            int var7 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
            if (var6 && !((rrmi_3)this.class_[3]).class_()) {
               ((rrmi_3)this.class_[3]).class_(((cb_3)import_.class_[57]).ss(), var7);
            }

            this.class_(var4, var7);
            if (var6) {
               ((rrmi_3)this.class_[2]).class_(var3, var4);
            }
         } else if (((rrmi_3)this.class_[3]).class_() && ((rrmi_3)this.class_[2]).class_()) {
            int var13 = ((rrmi_3)this.class_[3]).class_(false);
            if (var13 != -1) {
               this.class_(((rrmi_3)this.class_[2]).break_(), ((rrmi_3)this.class_[3]).break_());
            }

            ((rrmi_3)this.class_[3]).throws_();
         }

         Boolean var12 = false;
         this.class_[4] = var12;
      }
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.case_();
      if (var1.break_() == ((rrIF)this.class_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.class_[4] = var6;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4991534746867526800L;
   }

   @Override
   public Predicate<rdn_3> break_() {
      return var1 -> {
         this.case_();
         if (var1.break_() == this.class_()) {
            return ((rrIk_1)this.class_[1]).class_() ? var1.protected_("custom-enchantments") : catch_[17];
         } else {
            return catch_[18];
         }
      };
   }

   private static void throws_() {
      catch_ = new boolean[]{
         false, true, false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, true
      };
   }

   private static void finally_() {
      case_ = new String[]{new String("Активация"), new String("Только крушителя"), new String("Трезубец"), new String("custom-enchantments")};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         this.class_[4] = false;
      }
   }

   private Pair<rdn_3, Integer> implements_() {
      Predicate var1 = this.break_();
      if (var1 == null) {
         return Pair.of(null, -1);
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return Pair.of(null, -2);
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return Pair.of(null, -3);
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = 0; var3 < 45; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var3);
            if (var1.test(var4)) {
               var2.add(Pair.of(var4, var3));
            }
         }

         if (var2.isEmpty()) {
            return Pair.of(null, -1);
         } else {
            var2.sort((var0, var1x) -> ((rrCH)break_[0]).class_((rdn_3)var0.getLeft(), (rdn_3)var1x.getLeft()));
            return (Pair<rdn_3, Integer>)var2.get(0);
         }
      }
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrCH()};
      break_ = var0;
   }

   private static void private_() {
      protected_ = new short[]{
         0, 0, 1, 2, 3, 0, 1, 0, 4, 0, 4, 2, 2, 2, 57, 1, 3, 3, 57, 2, 3, 2, 3, 2, 3, 3, 4, 55, 57, 4, 0, 57, 1, 57, 57, 57, 1, 4, 2, 3, 1, 0
      };
   }

   @Override
   public boolean aK_() {
      this.case_();
      Boolean var5 = false;
      this.class_[4] = var5;
      ((rrmi_3)this.class_[2]).throws_();
      ((rrmi_3)this.class_[3]).throws_();
      return super.aK_();
   }
}
