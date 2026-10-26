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
   private static double[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   private static boolean[] id_case;
   public Object[] id_break;
   private static long[] id_catch;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   public Bk_1(C_class var1) {
      super(var1);
      this.id_byte();
      LinkedList var6 = new LinkedList();
      this.id_break[0] = var6;
      HashSet var7 = new HashSet();
      this.id_break[1] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_byte();
      if (!((LinkedList)this.id_break[0]).isEmpty() && !((Set)this.id_break[1]).isEmpty()) {
         long var2 = rqR_2.id_break() - 1000L;
         if (!((LinkedList)this.id_break[0]).isEmpty()) {
            ((LinkedList)this.id_break[0]).removeIf(var2x -> var2x.id_class() < var2 ? true : id_case[5]);
         }

         if (!((Set)this.id_break[1]).isEmpty()) {
            ((Set)this.id_break[1]).removeIf(var2x -> var2x.id_class() < var2 ? true : id_case[3]);
         }

         if (!((LinkedList)this.id_break[0]).isEmpty() && !((Set)this.id_break[1]).isEmpty()) {
            this.id_private();
         }
      }
   }

   private BW id_class(BQ var1, Collection<BW> var2) {
      if (var2.isEmpty()) {
         return null;
      } else {
         BW var3 = null;
         double var4 = Double.MAX_VALUE;
         rjU_2 var6 = var1.id_break();

         for (BW var8 : var2) {
            double var9 = var6.id_implements(var8.id_break());
            if (var9 < var4) {
               var4 = var9;
               var3 = var8;
            }
         }

         return var3;
      }
   }

   private void id_class(Bz_1 var1) {
      rrfO_2 var2 = rrfO_2.id_class(((BW)var1.id_class[1]).id_byte());
      if (var2 != null) {
         cb_3 var3 = ((Ps_1)this.id_class[1]).id_catch();
         rdn_3 var4 = var2.id_byte();
         rLY[] var5 = var2.id_class();

         for (BN var7 : ((BQ)var1.id_class[0]).id_protected()) {
            iB_2 var8 = var7.id_class();
            double var9 = var7.id_break();
            List var11 = this.id_class(var5, var9);
            if (!var11.isEmpty()) {
               rrLD.id_class(var8, var4, var11, var9);
               if (var8 != var3 && var8.BC() == aI_2.rM) {
                  for (rLY var13 : var11) {
                     var8.id_break(var13);
                  }
               }
            }
         }
      }
   }

   private List<rLY> id_class(rLY[] var1, double var2) {
      ArrayList var4 = new ArrayList(var1.length);

      for (rLY var8 : var1) {
         rLR var9 = var8.id_class();
         if (!var9.id_class()) {
            int var10 = (int)(var2 * (double)var8.id_break() + 0.5);
            if (var10 > 20) {
               var4.add(new rLY(var9, var10, var8.id_byte(), var8.id_protected(), var8.id_throws()));
            }
         }
      }

      return var4;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2747455820317521387L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1727813871;
   }

   public boolean id_class() {
      return true;
   }

   public void id_class(an_3 var1, rjU_2 var2, rdn_3 var3, List<BN> var4) {
      this.id_byte();
      ((LinkedList)this.id_break[0]).add(new BQ(var1, var2, var3, var4));
   }

   @Override
   public void id_class(rrnd_3 var1) {
      this.id_byte();
      if (this.id_class()) {
         rjU_2 var2 = var1.id_break();
         int var3 = var1.id_class();
         if (var3 != rAB.id_class(rAS.id_break)) {
            ((Set)this.id_break[1]).add(new BW(var2, var3));
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{42, -14, -10, -81, -95, -85, 19, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new short[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0};
   }

   private static void id_throws() {
      id_protected = new byte[]{20, 2};
   }

   private static void id_catch() {
      id_case = new boolean[]{false, true, true, false, true, false};
   }

   private static void id_case() {
      id_catch = new long[]{1000L};
   }

   private static void id_protected() {
      id_byte = new double[]{Double.MAX_VALUE, 0.5};
   }

   private void id_private() {
      this.id_byte();
      ArrayList var1 = new ArrayList();
      Iterator var2 = ((LinkedList)this.id_break[0]).iterator();

      while (var2.hasNext()) {
         BQ var3 = (BQ)var2.next();
         BW var4 = this.id_class(var3, (Set)this.id_break[1]);
         if (var4 != null) {
            var1.add(new Bz_1(var3, var4));
            var2.remove();
            ((Set)this.id_break[1]).remove(var4);
         }
      }

      for (Bz_1 var6 : var1) {
         this.id_class(var6);
      }
   }
}
