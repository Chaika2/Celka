package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZy_1 extends rrZN {
   private static float[] protected_;
   private static String[] throws_;
   private static boolean[] case_;
   public static Object[] break_;
   public Object[] byte_;
   private static byte[] catch_;
   private static short[] private_;

   @Override
   public void byte_(int var1, int var2, int var3) {
      this.else_();
      super.byte_(var1, var2, var3);
      ((rrtY_2)this.byte_[1]).byte_(var1, var2, var3);
   }

   private static void int_() {
      catch_ = new byte[]{4};
   }

   public rrZy_1(rrvJ var1) {
      this.else_();
      AnimValue var6 = new AnimValue(0.6F, false);
      this.byte_[2] = var6;
      this.byte_[0] = var1;
      rrtY_2 var8 = new rrtY_2(new rrIv_1("Поиск", (rrte_3)break_[0]).package_(), (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[2]);
      this.byte_[1] = var8;
      ((rrtY_2)this.byte_[1]).class_(() -> {
         this.else_();
         return ((rrtY_2)this.byte_[1]).super_() - 40.0F;
      });
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      Object[] var0 = new Object[]{rrte_3.class_(Pattern.compile("[a-zA-Zа-яА-Я0-9 -]+", 0))};
      break_ = var0;
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.else_();
      ((AnimValue)this.byte_[2]).class_(this.package_());
      float var10 = 54.0F * ((AnimValue)this.byte_[2]).byte_();
      return ((rrtY_2)this.byte_[1]).class_(var1, var2, var3, var4, var5 - var10, var6, var7, var8, var9);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.else_();
      boolean var4 = ((rrtY_2)this.byte_[1]).class_(var1, var2, var3);
      this.volatile_();
      return var4;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.else_();
      if (!((rrtY_2)this.byte_[1]).class_(var1, var2, var3, var4, var5)) {
         ((rrtY_2)this.byte_[1]).throws_();
         return false;
      } else {
         return case_[2];
      }
   }

   @Override
   public void class_(Category var1, Category var2) {
      super.class_(var1, var2);
      this.new_();
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.else_();
      boolean var3 = ((rrtY_2)this.byte_[1]).class_(var1, var2);
      this.volatile_();
      return var3;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3638119927961857032L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1557758448;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -52, -21, -34, 42, 100, -4, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_() {
      this.else_();
      super.throws_();
      ((rrtY_2)this.byte_[1]).throws_();
   }

   public AnimValue finally_() {
      this.else_();
      return (AnimValue)this.byte_[2];
   }

   @Override
   public void catch_() {
      this.else_();
      super.catch_();
      ((rrtY_2)this.byte_[1]).catch_();
   }

   public rrtY_2 extends_() {
      this.else_();
      return (rrtY_2)this.byte_[1];
   }

   private static void continue_() {
      private_ = new short[]{2, 0, 0, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 0, 1, 1, 1, 1, 0, 1, 2, 1};
   }

   private void else_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[4];
         Object[] var1 = this.byte_;
      }
   }

   private void new_() {
      this.else_();
      if ((Float)this.byte_[3] != null) {
         rrZH var1 = this.return_();
         if (var1 != null) {
            var1.class_((Float)this.byte_[3]);
         }

         Object var6 = null;
         this.byte_[3] = var6;
      }
   }

   private boolean package_() {
      this.else_();
      rrZN var1 = ((rrvJ)this.byte_[0]).native_();
      return var1 instanceof rrZw_1;
   }

   private rrZH return_() {
      this.else_();
      return ((rrvJ)this.byte_[0]).native_() instanceof rrZT var1 ? var1.case_().extends_() : null;
   }

   private static void super_() {
      throws_ = new String[]{new String("Поиск"), new String("[a-zA-Zа-яА-Я0-9 -]+")};
   }

   @Override
   public void protected_() {
      this.else_();
      super.protected_();
      ((rrtY_2)this.byte_[1]).protected_();
   }

   @Override
   public void private_() {
      this.else_();
      super.private_();
      this.new_();
      ((rrtY_2)this.byte_[1]).private_();
   }

   private void volatile_() {
      this.else_();
      rrZH var1 = this.return_();
      if (var1 != null) {
         if (!((rrtY_2)this.byte_[1]).new_()) {
            if ((Float)this.byte_[3] == null) {
               Float var6 = var1.break_();
               this.byte_[3] = var6;
               var1.class_(0.0F);
            }
         } else {
            this.new_();
         }
      }
   }

   private static void synchronized_() {
      case_ = new boolean[]{false, false, false, false, true};
   }

   private static void native_() {
      protected_ = new float[]{0.6F, 54.0F, 0.0F, 40.0F};
   }
}
