package celestial;

import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ez_1 extends MP {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static double[] throws_;

   @Override
   public rP_2 byte_() {
      this.volatile_();
      return (rP_2)this.class_[5];
   }

   public Ez_1(rU_2 var1, EQ var2, EQ var3, int var4, rP_2 var5, EZ var6) {
      this.volatile_();
      rU_2 var16 = new rU_2((Integer)var3.class_[0], (Integer)var3.class_[1], (Integer)var3.class_[2]);
      this.class_[1] = var16;
      Integer var17 = var4;
      this.class_[6] = var17;
      ArrayList var18 = new ArrayList();
      this.class_[3] = var18;
      this.class_[5] = var5;
      this.class_[7] = var6;
      EQ var7 = var3;
      ArrayList var8 = new ArrayList();

      ArrayList var9;
      for (var9 = new ArrayList(); var7 != null; var7 = (EQ)var7.class_[6]) {
         var9.add(var7);
         var8.add(new rU_2((Integer)var7.class_[0], (Integer)var7.class_[1], (Integer)var7.class_[2]));
      }

      rU_2 var10 = new rU_2((Integer)var2.class_[0], (Integer)var2.class_[1], (Integer)var2.class_[2]);
      if (!var1.equals(var10) && var2.equals(var3)) {
         this.class_[0] = var1;
         EQ var11 = new EQ((Integer)var1.break_[0], (Integer)var1.break_[1], (Integer)var1.break_[2], var5);
         Double var22 = 0.0;
         var11.class_[4] = var22;
         var9.add(var11);
         var8.add(var1);
      } else {
         this.class_[0] = var10;
      }

      List var24 = Lists.reverse(var8);
      this.class_[2] = var24;
      List var25 = Lists.reverse(var9);
      this.class_[4] = var25;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 9, 64, 5, -26, 39, -91, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Ev_1 class_(rU_2 var1, rU_2 var2, double var3) {
      this.volatile_();

      for (EC var8 : EC.values()) {
         Ev_1 var9 = var8.class_((EZ)this.class_[7], var1);
         if (var9.implements_().equals(var2)) {
            var9.byte_(Math.min(var9.class_((EZ)this.class_[7]), var3));
            return var9;
         }
      }

      PP.a_.byte_("Movement became impossible during calculation " + var1 + " " + var2 + " " + var2.byte_(var1));
      return null;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5246446876764840531L;
   }

   @Override
   public List<rU_2> break_() {
      this.volatile_();
      return Collections.unmodifiableList((List<? extends rU_2>)this.class_[2]);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1380572557;
   }

   private static void finally_() {
      break_ = new short[]{
         0, 1, 2, 1, 6, 3, 5, 7, 0, 1, 2, 6, 0, 1, 2, 0, 0, 1, 2, 4, 0, 2, 4, 5, 2, 3, 2, 4, 4, 4, 4, 2, 2, 3, 7, 7, 8, 8, 3, 3, 8, 3, 2, 6, 0, 1, 7
      };
   }

   @Override
   public List<rd_3> catch_() {
      this.volatile_();
      if (!(Boolean)this.class_[8]) {
         throw new IllegalStateException();
      } else {
         return Collections.unmodifiableList((List<? extends rd_3>)this.class_[3]);
      }
   }

   private boolean extends_() {
      this.volatile_();
      if (!((List)this.class_[2]).isEmpty() && ((List)this.class_[3]).isEmpty()) {
         for (int var1 = protected_[0]; var1 < ((List)this.class_[2]).size() - 1; var1++) {
            double var2 = (Double)((EQ)((List)this.class_[4]).get(var1 + 1)).class_[4] - (Double)((EQ)((List)this.class_[4]).get(var1)).class_[4];
            Ev_1 var4 = this.class_((rU_2)((List)this.class_[2]).get(var1), (rU_2)((List)this.class_[2]).get(var1 + 1), var2);
            if (var4 == null) {
               return true;
            }

            ((List)this.class_[3]).add(var4);
         }

         return protected_[5];
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public int case_() {
      this.volatile_();
      return (Integer)this.class_[6];
   }

   @Override
   public rU_2 implements_() {
      this.volatile_();
      return (rU_2)this.class_[0];
   }

   private static void package_() {
      protected_ = new boolean[]{false, true, true, true, true, false, false, true, false, false};
   }

   @Override
   public rU_2 protected_() {
      this.volatile_();
      return (rU_2)this.class_[1];
   }

   @Override
   public a_1 private_() {
      this.volatile_();
      if ((Boolean)this.class_[8]) {
         throw new IllegalStateException();
      } else {
         Boolean var7 = true;
         this.class_[8] = var7;
         boolean var1 = this.extends_();
         ((List)this.class_[3]).forEach(var1x -> {
            this.volatile_();
            var1x.byte_((EZ)this.class_[7]);
         });
         if (var1) {
            GO var2 = new GO(this, this.catch_().size());
            if (var2.catch_().size() != ((List)this.class_[3]).size()) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            this.throws_();
            return this;
         }
      }
   }

   private static void final_() {
      throws_ = new double[1];
   }

   private void volatile_() {
      if (this.class_ == null) {
         this.class_ = new Object[9];
         Object[] var1 = this.class_;
         var1[6] = 0;
         var1[8] = false;
      }
   }

   private static void native_() {
      byte_ = new byte[]{9, 6, 8};
   }
}
