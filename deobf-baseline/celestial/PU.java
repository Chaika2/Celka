package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PU extends Pv_1 implements PP {
   private static double[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;
   public Object[] id_break;
   private static short[] id_private;
   private static boolean[] id_implements;

   private static void id_byte() {
      id_private = new short[]{
         0,
         1,
         1,
         4,
         1,
         3,
         0,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         1,
         1,
         3,
         0,
         1,
         1,
         1,
         0,
         1,
         1,
         0,
         0,
         0,
         0,
         0,
         34,
         0,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1
      };
   }

   public PU(C_class var1) {
      super(var1);
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public OptionalInt id_class(Predicate<Integer> var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = id_implements[8]; var3 < id_catch[3]; var3++) {
         if (((rhz_3)((Ps_1)this.id_class[id_private[13]]).id_catch().id_implements[id_private[14]]).id_class.get(var3).id_class() && !var1.test(var3)) {
            var2.add(var3);
         }
      }

      if (var2.isEmpty()) {
         for (int var4 = id_implements[9]; var4 < id_catch[4]; var4++) {
            if (!var1.test(var4)) {
               var2.add(var4);
            }
         }
      }

      return var2.isEmpty() ? OptionalInt.empty() : OptionalInt.of((Integer)var2.get(new Random().nextInt(var2.size())));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7669350632924944642L;
   }

   private int id_class(xd_3 var1, Class<? extends rkQ_2> var2) {
      rqs_3 var3 = ((rhz_3)((Ps_1)this.id_class[id_private[30]]).id_catch().id_implements[id_private[31]]).id_class;
      int var4 = id_catch[9];
      double var5 = id_throws[0];

      for (int var7 = id_implements[18]; var7 < var3.size(); var7++) {
         rdn_3 var8 = (rdn_3)var3.get(var7);
         if (!var8.id_class()
            && (
               !(Boolean)C_class.id_instanceof().Br.id_class[id_private[32]]
                  || var8.id_catch() + (Integer)C_class.id_instanceof().V.id_class[id_private[33]] < var8.id_private()
                  || var8.id_private() <= id_implements[19]
            )
            && var2.isInstance(var8.id_break())) {
            double var9 = bU_2.id_class(var8, var1.id_continue());
            if (var9 > var5) {
               var5 = var9;
               var4 = var7;
            }
         }
      }

      return var4;
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_protected();
      if ((Boolean)C_class.id_instanceof().z.id_class[id_private[0]]) {
         if (var1.id_class() != (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_private[1]]) {
            if ((rJr_1)((Ps_1)this.id_class[id_private[2]]).id_catch().id_implements[id_private[3]]
               == (rJT)((Ps_1)this.id_class[id_private[4]]).id_catch().id_implements[id_private[5]]) {
               Integer var7 = (Integer)this.id_break[id_private[6]] + id_implements[0];
               this.id_break[id_private[7]] = var7;
               if (this.id_throws() >= id_catch[0]) {
                  this.id_class(this.id_throws(), id_catch[1]);
               }

               int var2 = this.id_class(xu_3.id_break, rdD_2.class);
               if (var2 >= id_catch[2]) {
                  this.id_class(var2, id_implements[1]);
               }

               if ((int[])this.id_break[id_private[8]] != null) {
                  this.id_byte(
                     "Remembering to move "
                        + ((int[])this.id_break[id_private[9]])[id_implements[2]]
                        + " "
                        + ((int[])this.id_break[id_private[10]])[id_implements[3]]
                        + " from a previous tick"
                  );
                  this.id_class(((int[])this.id_break[id_private[11]])[id_implements[4]], ((int[])this.id_break[id_private[12]])[id_implements[5]]);
               }
            }
         }
      }
   }

   private boolean id_class(int var1, int var2) {
      this.id_protected();
      int[] var10001 = new int[id_catch[5]];
      var10001[id_implements[10]] = var1;
      var10001[id_implements[11]] = var2;
      int[] var7 = var10001;
      this.id_break[id_private[15]] = var7;
      if ((Integer)this.id_break[id_private[16]] < (Integer)C_class.id_instanceof().PF.id_class[id_private[17]]) {
         this.id_byte(
            "Inventory move requested but delaying " + (Integer)this.id_break[id_private[18]] + " " + C_class.id_instanceof().PF.id_class[id_private[19]]
         );
         return id_implements[12];
      } else if ((Boolean)C_class.id_instanceof().id_class.id_class[id_private[20]] && !((C_class)this.id_class[id_private[21]]).id_const().id_private()) {
         this.id_byte(id_case[0]);
         return id_implements[13];
      } else {
         PE var10000 = ((Ps_1)this.id_class[id_private[22]]).id_native();
         int var10002 = var1 < id_catch[6] ? var1 + id_catch[7] : var1;
         var10000.id_class(
            ((rJT)((Ps_1)this.id_class[id_private[23]]).id_catch().id_implements[id_private[24]]).id_case, var10002, var2, rXa_1.SWAP, id_implements[14]
         );
         Integer var8 = Integer.valueOf(id_implements[15]);
         this.id_break[id_private[25]] = var8;
         Object var9 = null;
         this.id_break[id_private[26]] = var9;
         return id_implements[16];
      }
   }

   public boolean id_class(boolean var1, Predicate<? super rdn_3> var2, boolean var3) {
      cb_3 var4 = ((Ps_1)this.id_class[id_private[40]]).id_catch();
      rqs_3 var5 = ((rhz_3)var4.id_implements[id_private[41]]).id_class;

      for (int var6 = id_implements[27]; var6 < id_catch[10]; var6++) {
         rdn_3 var7 = (rdn_3)var5.get(var6);
         if (var2.test(var7)) {
            if (var1) {
               ((rhz_3)var4.id_implements[id_private[42]]).id_protected = var6;
            }

            return id_implements[28];
         }
      }

      if (var2.test(((rhz_3)var4.id_implements[id_private[43]]).id_byte.get(id_implements[29]))) {
         for (int var8 = id_implements[30]; var8 < id_catch[11]; var8++) {
            rdn_3 var10 = (rdn_3)var5.get(var8);
            if (var10.id_class() || var10.id_break() instanceof rdD_2) {
               if (var1) {
                  ((rhz_3)var4.id_implements[id_private[44]]).id_protected = var8;
               }

               return id_implements[31];
            }
         }
      }

      if (var3) {
         for (int var9 = id_catch[12]; var9 < id_catch[13]; var9++) {
            if (var2.test(var5.get(var9))) {
               if (var1) {
                  this.id_class(var9, id_catch[14]);
                  ((rhz_3)var4.id_implements[id_private[45]]).id_protected = id_catch[15];
               }

               return id_implements[32];
            }
         }
      }

      return id_implements[33];
   }

   public boolean id_class(boolean var1, int var2, int var3, int var4) {
      xc_3 var5 = ((C_class)this.id_class[id_private[35]])
         .b()
         .id_class(var2, var3, var4, ((bw_3)((C_class)this.id_class[id_private[36]]).id_break[id_private[37]]).id_class(var2, var3, var4));
      if (var5 != null
         && this.id_class(
            var1,
            var2x -> var2x.id_break() instanceof rxJ_2
                     && var5.equals(
                        ((rxJ_2)var2x.id_break())
                           .id_catch()
                           .id_class(
                              new rxx_3(
                                 new Pe_1(
                                    this,
                                    ((Ps_1)this.id_class[id_private[46]]).id_case(),
                                    ((Ps_1)this.id_class[id_private[47]]).id_catch(),
                                    rpm_3.MAIN_HAND,
                                    var2x,
                                    new rff_3(
                                       new rjU_2(
                                          ((Ps_1)this.id_class[id_private[48]]).id_catch().Ps().id_break,
                                          ((Ps_1)this.id_class[id_private[49]]).id_catch().Ps().id_byte,
                                          ((Ps_1)this.id_class[id_private[50]]).id_catch().Ps().id_protected
                                       ),
                                       rpr_3.UP,
                                       ((Ps_1)this.id_class[id_private[51]]).id_volatile(),
                                       id_implements[36]
                                    )
                                 )
                              )
                           )
                     )
                  ? id_implements[37]
                  : id_implements[38]
         )) {
         return id_implements[23];
      } else if (var5 != null
         && this.id_class(
            var1,
            var1x -> var1x.id_break() instanceof rxJ_2 && ((rxJ_2)var1x.id_break()).id_catch().equals(var5.id_break()) ? id_implements[34] : id_implements[35]
         )) {
         return id_implements[24];
      } else {
         for (rdb_3 var7 : (List)C_class.id_instanceof().PX.id_class[id_private[38]]) {
            if (this.id_class(var1, var1x -> var7.equals(var1x.id_break()))) {
               return id_implements[25];
            }
         }

         return id_implements[26];
      }
   }

   public boolean id_class(int var1, Predicate<Integer> var2) {
      OptionalInt var3 = this.id_class(var2);
      return var3.isPresent() && !this.id_class(var1, var3.getAsInt()) ? id_implements[6] : id_implements[7];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 846506650;
   }

   public boolean id_class() {
      for (rdb_3 var2 : (List)C_class.id_instanceof().PX.id_class[id_private[34]]) {
         if (this.id_class(id_implements[20], var1 -> var2.equals(var1.id_break()))) {
            return id_implements[21];
         }
      }

      return id_implements[22];
   }

   public boolean id_class(boolean var1, Predicate<? super rdn_3> var2) {
      return this.id_class(var1, var2, (Boolean)C_class.id_instanceof().z.id_class[id_private[39]]);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, 31, -42, -89, -118, 80, -107, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new double[]{-1.0};
   }

   private int id_throws() {
      rqs_3 var1 = ((rhz_3)((Ps_1)this.id_class[id_private[27]]).id_catch().id_implements[id_private[28]]).id_class;

      for (int var2 = id_implements[17]; var2 < var1.size(); var2++) {
         if (((List)C_class.id_instanceof().PX.id_class[id_private[29]]).contains(((rdn_3)var1.get(var2)).id_break())) {
            return var2;
         }
      }

      return id_catch[8];
   }

   private static void id_catch() {
      id_implements = new boolean[]{
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false
      };
   }

   private static void id_case() {
      id_catch = new byte[]{9, 8, 9, 8, 8, 2, 9, 36, -1, -1, 9, 9, 9, 36, 7, 7, 2};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[id_catch[16]];
         Object[] var1 = this.id_break;
         var1[id_implements[39]] = Integer.valueOf(id_implements[40]);
      }
   }

   private static void id_private() {
      id_case = new String[]{new String("Inventory move requested but delaying until stationary")};
   }
}
