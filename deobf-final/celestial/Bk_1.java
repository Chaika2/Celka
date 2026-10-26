package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bk_1 extends Pv_1 {
   private static double[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   private static boolean[] case_;
   public Object[] break_;
   private static long[] catch_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public Bk_1(C_class var1) {
      super(var1);
      this.byte_();
      LinkedList var6 = new LinkedList();
      this.break_[0] = var6;
      HashSet var7 = new HashSet();
      this.break_[1] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(j_1 var1) {
      this.byte_();
      if (!((LinkedList)this.break_[0]).isEmpty() && !((Set)this.break_[1]).isEmpty()) {
         long var2 = rqR_2.break_() - 1000L;
         if (!((LinkedList)this.break_[0]).isEmpty()) {
            ((LinkedList)this.break_[0]).removeIf(var2x -> var2x.class_() < var2 ? true : case_[5]);
         }

         if (!((Set)this.break_[1]).isEmpty()) {
            ((Set)this.break_[1]).removeIf(var2x -> var2x.class_() < var2 ? true : case_[3]);
         }

         if (!((LinkedList)this.break_[0]).isEmpty() && !((Set)this.break_[1]).isEmpty()) {
            this.private_();
         }
      }
   }

   private BW class_(BQ var1, Collection<BW> var2) {
      if (var2.isEmpty()) {
         return null;
      } else {
         BW var3 = null;
         double var4 = Double.MAX_VALUE;
         rjU_2 var6 = var1.break_();

         for (BW var8 : var2) {
            double var9 = var6.implements_(var8.break_());
            if (var9 < var4) {
               var4 = var9;
               var3 = var8;
            }
         }

         return var3;
      }
   }

   private void class_(Bz_1 var1) {
      rrfO_2 var2 = rrfO_2.class_(((BW)var1.class_[1]).byte_());
      if (var2 != null) {
         cb_3 var3 = ((Ps_1)this.class_[1]).catch_();
         rdn_3 var4 = var2.byte_();
         rLY[] var5 = var2.class_();

         for (BN var7 : ((BQ)var1.class_[0]).protected_()) {
            iB_2 var8 = var7.class_();
            double var9 = var7.break_();
            List var11 = this.class_(var5, var9);
            if (!var11.isEmpty()) {
               rrLD.class_(var8, var4, var11, var9);
               if (var8 != var3 && var8.BC() == aI_2.rM) {
                  for (rLY var13 : var11) {
                     var8.break_(var13);
                  }
               }
            }
         }
      }
   }

   private List<rLY> class_(rLY[] var1, double var2) {
      ArrayList var4 = new ArrayList(var1.length);

      for (rLY var8 : var1) {
         rLR var9 = var8.class_();
         if (!var9.class_()) {
            int var10 = (int)(var2 * (double)var8.break_() + 0.5);
            if (var10 > 20) {
               var4.add(new rLY(var9, var10, var8.byte_(), var8.protected_(), var8.throws_()));
            }
         }
      }

      return var4;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2747455820317521387L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1727813871;
   }

   public boolean class_() {
      return true;
   }

   public void class_(an_3 var1, rjU_2 var2, rdn_3 var3, List<BN> var4) {
      this.byte_();
      ((LinkedList)this.break_[0]).add(new BQ(var1, var2, var3, var4));
   }

   @Override
   public void class_(rrnd_3 var1) {
      this.byte_();
      if (this.class_()) {
         rjU_2 var2 = var1.break_();
         int var3 = var1.class_();
         if (var3 != rAB.class_(rAS.break_)) {
            ((Set)this.break_[1]).add(new BW(var2, var3));
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{42, -14, -10, -81, -95, -85, 19, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new short[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0};
   }

   private static void throws_() {
      protected_ = new byte[]{20, 2};
   }

   private static void catch_() {
      case_ = new boolean[]{false, true, true, false, true, false};
   }

   private static void case_() {
      catch_ = new long[]{1000L};
   }

   private static void protected_() {
      byte_ = new double[]{Double.MAX_VALUE, 0.5};
   }

   private void private_() {
      this.byte_();
      ArrayList var1 = new ArrayList();
      Iterator var2 = ((LinkedList)this.break_[0]).iterator();

      while (var2.hasNext()) {
         BQ var3 = (BQ)var2.next();
         BW var4 = this.class_(var3, (Set)this.break_[1]);
         if (var4 != null) {
            var1.add(new Bz_1(var3, var4));
            var2.remove();
            ((Set)this.break_[1]).remove(var4);
         }
      }

      for (Bz_1 var6 : var1) {
         this.class_(var6);
      }
   }
}
