package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQn_1 extends Lg_1<rrQn_1> implements AutoCloseable {
   private static String[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static int[] protected_;
   private static short[] throws_;
   private static float[] case_;
   private static byte[] catch_;
   private static long[] private_;
   private static boolean[] implements_;

   public long byte_() {
      this.int_();
      return (Long)this.class_[3];
   }

   private void int_() {
      if (this.class_ == null) {
         this.class_ = new Object[9];
         Object[] var1 = this.class_;
         var1[3] = 0L;
         var1[5] = false;
         var1[6] = false;
         var1[7] = false;
      }
   }

   public rrQn_1(rrQA var1, QY var2, rrQC var3, rrQx_1 var4) {
      this.int_();
      this.class_[8] = var1;
      this.class_[0] = var2;
      this.class_[2] = var3;
      this.class_[1] = var4;
      UUID var5 = ((rrQx_1)this.class_[1]).protected_();
      rqO_2 var14 = jH_2.class_(var5);
      this.class_[4] = var14;
      Boolean var15 = jH_2.break_(var5).equalsIgnoreCase("slim");
      this.class_[5] = var15;
   }

   static {
      ntfClinit();
   }

   public void class_(int var1, int var2) {
      this.int_();

      try {
         List var3 = ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[throws_[46]]).class_();
         rrQx_1 var4 = (rrQx_1)var3.get(var1);
         var3.set(var1, (rrQx_1)var3.get(var2));
         var3.set(var2, var4);
         List var5 = ((rrQA)this.class_[throws_[47]]).x_();
         rrQn_1 var6 = (rrQn_1)rrQA.byte_((rrQA)this.class_[throws_[48]], var1);
         var5.set(var1, (rrQn_1)rrQA.break_((rrQA)this.class_[throws_[49]], var2));
         var5.set(var2, var6);
         rrQn_1 var7 = (rrQn_1)rrQA.class_((rrQA)this.class_[throws_[50]], var2);
         ((rrQA)this.class_[throws_[51]]).class_(var7);
         rrQA.class_((rrQA)this.class_[throws_[52]], var7);
         ((Lu_1)((rrQC)this.class_[throws_[53]]).class_[throws_[54]]).byte_(implements_[23]);
      } catch (Exception var8) {
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.int_();
      Boolean var19 = false;
      this.class_[6] = var19;
      Boolean var20 = false;
      this.class_[7] = var20;
      rrQx_1 var11 = (rrQx_1)this.class_[1];
      int var12 = 16777215;
      if (var11.class_().equals(((QY)this.class_[0]).while_().byte_())) {
         var12 = 65280;
      }

      rrfD_2.class_(var1, (rqO_2)this.class_[4], ((Qw_1)((QY)this.class_[0]).class_[20]).break_(rhQ_2.HAT), (float)var4, (float)var3, 12, 12, 1.0F);
      ((cm_3)((QY)this.class_[0]).class_[15]).break_(var1, var11.class_(), (float)(var4 + 12 + 3), (float)(var3 + 2), var12);
      if (var9) {
         ch_3.class_(var1, var4, var3, var4 + 12, var3 + 12, -1601138544);
      }

      if (this == ((rrQA)this.class_[8]).finally_()) {
         ((QY)this.class_[0]).A().class_((rqO_2)break_[0]);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var13 = var2 + 1 < ((rrQA)this.class_[8]).this_().size() ? true : implements_[4];
         boolean var14 = var2 > 0 ? true : implements_[6];
         if (var13) {
            Boolean var21 = var9 && var7 > var4 + var5 - 16 && var7 < var4 + var5 - 6 ? true : implements_[8];
            this.class_[6] = var21;
            ch_3.class_(var1, var4 + var5 - 35, var3 - 18, 48.0F, this.class_[6] ? 32.0F : case_[7], catch_[11], 32, 256, 256);
         }

         if (var14) {
            Boolean var22 = var9 && var7 > var4 + var5 - (var13 ? 31 : catch_[14]) && var7 < var4 + var5 - (var13 ? 17 : catch_[16]) ? true : implements_[10];
            this.class_[7] = var22;
            ch_3.class_(var1, var4 + var5 - (var13 ? 31 : catch_[18]), var3 - 3, 96.0F, this.class_[7] ? 32.0F : case_[10], catch_[20], 32, 256, 256);
         }
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.int_();
      if (vm_3.synchronized_()) {
         List var4 = ((rrQA)this.class_[8]).x_();
         int var5 = var4.indexOf(this);
         if (var1 == 264 && var5 < var4.size() - 1) {
            this.class_(var5, var5 + 1);
            return true;
         }

         if (var1 == 265 && var5 > 0) {
            this.class_(var5, var5 - 1);
            return true;
         }
      } else if (var1 == 261 || var1 == 259) {
         ((rrQC)this.class_[2]).class_(this.private_());
         ((QY)this.class_[0]).c().class_(Np_1.class_(rqn_3.dw, 1.0F));
         return true;
      }

      return super.class_(var1, var2, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, -33, 9, 94, 26, 11, 88, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5782161596536643685L;
   }

   public boolean class_() {
      this.int_();
      return (Boolean)this.class_[5];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 758730307;
   }

   @Override
   public void close() {
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.int_();
      ((rrQA)this.class_[8]).class_(this);
      ((rrQC)this.class_[2]).byte_(((rrQA)this.class_[8]).private_().isPresent());
      if (var5 == 0) {
         List var6 = ((rrQA)this.class_[8]).this_();
         int var7 = var6.indexOf(this);
         if ((Boolean)this.class_[6] && var7 + 1 < var6.size()) {
            this.class_(var7, var7 + 1);
            return true;
         }

         if ((Boolean)this.class_[7] && var7 > 0) {
            this.class_(var7, var7 - 1);
            return true;
         }

         if (rqR_2.break_() - (Long)this.class_[3] < 250L) {
            ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0]).class_((rrQx_1)this.class_[1]);
            ((QY)this.class_[0]).c().class_(Np_1.class_(rqn_3.dw, 1.0F));
            return true;
         }

         Long var12 = rqR_2.break_();
         this.class_[3] = var12;
      }

      return super.break_(var1, var3, var5);
   }

   public rqO_2 break_() {
      this.int_();
      return (rqO_2)this.class_[4];
   }

   public boolean throws_() {
      this.int_();
      return (Boolean)this.class_[6];
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", "textures/gui/server_selection.png"), 12};
      break_ = var0;
   }

   public QY catch_() {
      this.int_();
      return (QY)this.class_[0];
   }

   private static void extends_() {
      catch_ = new byte[]{12, 12, 12, 3, 2, 12, 12, 16, 6, 35, 18, 32, 32, 31, 20, 17, 6, 31, 20, 3, 32, 32, 9, 3, 5, 6, 7, 2, 12};
   }

   public boolean case_() {
      this.int_();
      return (Boolean)this.class_[7];
   }

   private static void implements_() {
      private_ = new long[]{250L, 0L};
   }

   private static void new_() {
      implements_ = new boolean[]{
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
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
         true
      };
   }

   private static void package_() {
      protected_ = new int[]{16777215, 65280, -1601138544};
   }

   public rrQC protected_() {
      this.int_();
      return (rrQC)this.class_[2];
   }

   public rrQx_1 private_() {
      this.int_();
      return (rrQx_1)this.class_[1];
   }

   private static void final_() {
      throws_ = new short[]{
         8,
         0,
         2,
         1,
         1,
         4,
         5,
         6,
         7,
         1,
         0,
         4,
         0,
         20,
         0,
         15,
         8,
         0,
         0,
         8,
         6,
         6,
         256,
         256,
         7,
         7,
         256,
         256,
         8,
         2,
         8,
         8,
         6,
         7,
         3,
         0,
         1,
         0,
         3,
         8,
         264,
         265,
         261,
         259,
         2,
         0,
         0,
         8,
         8,
         8,
         8,
         8,
         8,
         2,
         4,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7
      };
   }

   private static void volatile_() {
      case_ = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 48.0F, 32.0F, 0.0F, 96.0F, 32.0F, 0.0F, 1.0F, 1.0F};
   }

   private static void native_() {
      byte_ = new String[]{new String("slim"), new String("textures/gui/server_selection.png")};
   }
}
