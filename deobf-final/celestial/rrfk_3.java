package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfk_3 extends vm_3 implements Zg_1 {
   private static int[] case_;
   public Object[] class_;
   private static short[] catch_;
   private static boolean[] private_;
   private static double[] implements_;
   private static float[] finally_;
   private static String[] else_;
   private static byte[] synchronized_;
   public static Object[] throws_;

   private static void char_() {
      private_ = new boolean[]{false, true, false, true, false, false, true};
   }

   @Override
   public rdn_3 byte_() {
      this.long_();
      return (rrfz_3)this.class_[2] != null ? ((rrfz_3)this.class_[2]).protected_().class_() : null;
   }

   private static void int_() {
      implements_ = new double[]{40.0};
   }

   private void long_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private static void float_() {
      synchronized_ = new byte[]{70, 25, 25, 10, 16, 3, 2};
   }

   public rrfk_3() {
      super(rgN_2.byte_);
      this.long_();
      rrfW_2 var5 = new rrfW_2(this);
      this.class_[0] = var5;
      rrZH var6 = new rrZH(0.5F);
      this.class_[1] = var6;
      ((List)this.class_[0]).sort(Comparator.comparingInt(var0 -> var0.class_().ordinal()));
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      case_ = new int[]{16777215, 16777215};
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      this.long_();
      ((rrZH)this.class_[1]).class_(true, var5, 40.0);
      return super.class_(var1, var3, var5);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, 53, -23, -7, -41, 38, 124, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7680056724408129596L;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.long_();
      super.class_(var1, var2, var3, var4);
      this.class_(var1);
      float var5 = 0.0F;
      int var6 = this.finally_();
      ((rrZH)this.class_[1]).class_((float)var6, (float)(import_.else_().this_() - 70));
      float var7 = ((rrZH)this.class_[1]).case_();
      Object var19 = null;
      this.class_[2] = var19;
      float var8 = import_.else_().package_() - 70.0F;

      for (int var9 = 0; var9 < ((List)this.class_[0]).size(); var9++) {
         rrfz_3 var10 = (rrfz_3)((List)this.class_[0]).get(var9);
         var10.byte_(var8);
         rrfJ_2 var11 = var10.protected_();
         rgP_2 var12 = var11.byte_();
         rdn_3 var13 = var11.class_();
         String var14 = ((rrfx_3)var10.class_[3]).protected_().name();
         import_.float_().class_(var13, (int)var10.throws_(), (int)var10.break_());
         ((cm_3)import_.class_[15]).break_(var1, var12, var10.throws_() + 20.0F, var10.break_() + 5.0F, 16777215);
         if (var10.class_((float)var2, (float)var3)) {
            this.class_[2] = var10;
            this.class_(var1, var13, var2, var3);
         }

         if (var9 > 0 && !((rrfz_3)((List)this.class_[0]).get(var9 - 1)).class_().protected_().equals(var10.class_().protected_())) {
            var5 += 32.0F;
         } else {
            var5 += 16.0F;
         }

         var10.break_(var5);
         if (!((Map)throws_[1]).containsKey(var14)) {
            ((Map)throws_[1]).put(var14, var10.break_());
         }
      }

      for (Entry var22 : ((Map)throws_[1]).entrySet()) {
         String var23 = rgF_2.STRIKETHROUGH + " ".repeat(25) + rgF_2.RESET + (String)var22.getKey() + rgF_2.STRIKETHROUGH + " ".repeat(25);
         float var24 = (Float)var22.getValue();
         ((cm_3)import_.class_[15])
            .break_(var1, var23, import_.else_().package_() - (float)((cm_3)import_.class_[15]).break_(var23) / 2.0F, var7 - 10.0F + var24, 16777215);
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.long_();

      for (rrfz_3 var7 : (List)this.class_[0]) {
         if (var7.class_((float)var1, (float)var3)) {
            if (!import_.finally_()) {
               String var9 = "Вы не можете выдать предмет не в одиночной игре";
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Items Menu", var9, 3000));
               return false;
            }

            rYB var8 = rrjv_3.class_();
            var8.a_(
               new rsE_2(var8, ((cb_3)import_.class_[57]).rx(), ((cb_3)import_.class_[57]).re(), ((cb_3)import_.class_[57]).BO(), var7.protected_().class_())
            );
            break;
         }
      }

      return super.break_(var1, var3, var5);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1926980289;
   }

   public int finally_() {
      this.long_();
      int var1 = 0;
      var1 += ((List)this.class_[0]).stream().mapToInt(var0 -> 16).sum();
      return var1 + ((Map)throws_[1]).size() * 10;
   }

   private static void package_() {
      catch_ = new short[]{0, 1, 0, 1, 1, 2, 0, 0, 3, 15, 2, 0, 1, 1, 1, 15, 15, 0, 1, 1, 0, 0, 3000, 57, 57, 57, 2, 2};
   }

   private static void abstract_() {
      else_ = new String[]{new String(" "), new String(" "), new String("Вы не можете выдать предмет не в одиночной игре"), new String("Items Menu")};
   }

   private static void final_() {
      Object[] var0 = new Object[]{new rrfk_3(), new HashMap()};
      throws_ = var0;
   }

   private static void native_() {
      finally_ = new float[]{0.5F, 0.0F, 70.0F, 20.0F, 5.0F, 32.0F, 16.0F, 2.0F, 10.0F};
   }
}
