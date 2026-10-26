package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GH extends bq_3 implements ru_3 {
   private static String[] id_throws;
   private static short[] id_catch;
   private static byte[] id_private;
   public Object[] id_break;
   private static boolean[] id_implements;

   @Override
   public boolean id_byte() {
      this.id_extends();
      return (rfH_2)this.id_break[id_catch[0]] != null ? id_implements[0] : id_implements[1];
   }

   public GH(C_class var1) {
      super(var1);
      this.id_extends();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -23, -63, 82, 31, -30, 115, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(int var1, int var2) {
      this.id_extends();
      rfH_2 var7 = new rfH_2(var1, id_implements[2], var2);
      this.id_break[id_catch[1]] = var7;
      Integer var8 = Integer.valueOf(id_implements[3]);
      this.id_break[id_catch[2]] = var8;
   }

   @Override
   public String id_class() {
      this.id_extends();
      return "Exploring around "
         + (rfH_2)this.id_break[id_catch[20]]
         + ", distance completed "
         + (Integer)this.id_break[id_catch[21]]
         + ", currently going to "
         + new rs_3(this.id_class((rfH_2)this.id_break[id_catch[22]], this.id_private()));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8400867671493055089L;
   }

   @Override
   public void id_class(Path var1, boolean var2) throws Exception {
      this.id_extends();
      Gw_1 var7 = new Gw_1(this, var1, var2);
      this.id_break[id_catch[3]] = var7;
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_extends();
      if (var1) {
         this.id_case(id_throws[0]);
         if ((Boolean)C_class.id_instanceof().id_abstract.id_class[id_catch[6]]) {
            this.id_byte(id_throws[1], id_implements[4]);
         }

         this.id_protected();
         return null;
      } else {
         Gt_1 var3 = this.id_private();
         if (!(Boolean)C_class.id_instanceof().PN.id_class[id_catch[7]] && var3.id_class() == 0) {
            this.id_case(id_throws[2]);
            if ((Boolean)C_class.id_instanceof().id_abstract.id_class[id_catch[8]]) {
               this.id_byte(id_throws[3], id_implements[5]);
            }

            this.id_protected();
            return null;
         } else {
            rP_2[] var4 = this.id_class((rfH_2)this.id_break[id_catch[9]], var3);
            if (var4 == null) {
               this.id_byte(id_throws[4]);
               return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[10]]);
            } else {
               return new rn_3(new rs_3(var4), (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[11]]);
            }
         }
      }
   }

   private rP_2[] id_class(rfH_2 var1, Gt_1 var2) {
      this.id_extends();
      int var3 = var1.b_() >> id_private[0];
      int var4 = var1.d_() >> id_private[1];
      int var5 = Math.min(var2.id_class(), (Integer)C_class.id_instanceof().rR.id_class[id_catch[12]]);
      ArrayList var6 = new ArrayList();
      int var7 = (Integer)C_class.id_instanceof().Pm.id_class[id_catch[13]];
      int var8 = (Integer)this.id_break[id_catch[14]];

      while (true) {
         for (int var9 = -var8; var9 <= var8; var9++) {
            int var10 = var8 - Math.abs(var9);
            int var11 = id_implements[6];

            while (var11 < id_private[2]) {
               int var12 = (var11 * id_private[3] - id_implements[7]) * var10;
               int var13 = Math.abs(var9) + Math.abs(var12);
               if (var13 != var8) {
                  throw new IllegalStateException();
               }

               switch (((int[])Gp_1.id_class[id_catch[15]])[var2.id_class(var3 + var9, var4 + var12).ordinal()]) {
                  case 1:
                     return null;
                  case 2:
                  default:
                     int var14 = (var3 + var9 << id_private[4]) + id_private[5];
                     int var15 = (var4 + var12 << id_private[6]) + id_private[7];
                     int var16 = var7 << id_private[8];
                     if (var9 < 0) {
                        var14 -= var16;
                     } else {
                        var14 += var16;
                     }

                     if (var12 < 0) {
                        var15 -= var16;
                     } else {
                        var15 += var16;
                     }

                     var6.add(new rfH_2(var14, id_implements[8], var15));
                  case 3:
                     var11++;
               }
            }
         }

         if (var8 % id_private[9] == 0) {
            var5 = Math.min(var2.id_class(), (Integer)C_class.id_instanceof().rR.id_class[id_catch[16]]);
         }

         if (var6.size() >= var5) {
            return var6.stream().map(var0 -> id_break(var0.b_(), var0.d_())).toArray(rP_2[]::new);
         }

         if (var6.isEmpty()) {
            Integer var21 = var8 + id_implements[9];
            this.id_break[id_catch[17]] = var21;
         }

         var8++;
      }
   }

   private static rP_2 id_break(int var0, int var1) {
      return (rP_2)(C_class.id_instanceof().rP.id_class[id_catch[18]] == id_private[10] ? new rX_2(var0, var1) : new Gy_1(var0, var1));
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 712789841;
   }

   private static void id_finally() {
      id_catch = new short[]{0, 0, 2, 1, 1, 1, 0, 0, 0, 0, 1, 4, 0, 0, 2, 0, 0, 2, 0, 0, 0, 2, 0, 0};
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[id_private[11]];
         Object[] var1 = this.id_break;
         var1[id_private[12]] = Integer.valueOf(id_implements[10]);
      }
   }

   private static void id_implements() {
      id_implements = new boolean[]{true, false, false, false, true, false, false, true, false, true, false};
   }

   @Override
   public void id_protected() {
      this.id_extends();
      super.id_protected();
      Object var5 = null;
      this.id_break[id_catch[19]] = var5;
   }

   public Gt_1 id_private() {
      this.id_extends();
      Object var1;
      if ((Gt_1)this.id_break[id_catch[4]] != null) {
         var1 = new GT(this, (Gt_1)this.id_break[id_catch[5]], new Gq_1(this));
      } else {
         var1 = new Gq_1(this);
      }

      return (Gt_1)var1;
   }

   private static void id_volatile() {
      id_private = new byte[]{4, 4, 2, 2, 4, 8, 4, 8, 4, 10, -1, 3, 2};
   }

   private static void id_native() {
      id_throws = new String[]{
         new String("Failed"),
         new String("Exploration failed"),
         new String("Explored all chunks"),
         new String("Explored all chunks"),
         new String("awaiting region load from disk")
      };
   }
}
