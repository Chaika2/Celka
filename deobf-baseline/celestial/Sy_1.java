package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sy_1 extends Sv_1 {
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static long[] id_throws;
   private static short[] id_case;
   public Object[] id_break;
   private static byte[] id_catch;

   @Override
   public void id_byte() {
      this.id_private();
      super.id_byte();
      Boolean var5 = id_byte[1];
      this.id_break[id_case[1]] = var5;
      Object var6 = null;
      this.id_break[id_case[2]] = var6;
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{124, -47, -116, 106, 3, -18, 23, -64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Sy_1(SL var1) {
      super(var1);
      this.id_private();
      rrfw_3 var6 = new rrfw_3();
      this.id_break[id_case[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -613907244444038808L;
   }

   private Sp_1 id_class(PK var1, List<rdn_3> var2) {
      String var3 = var1.id_class();

      for (rdn_3 var5 : var2) {
         if (var5.id_break() == rdy_3.dq) {
            String var6 = var5.id_continue().id_byte();
            if (var6.contains(var3)) {
               return new Sp_1(this, var5, (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[29]]);
            }
         }
      }

      return null;
   }

   @Override
   public void id_class(SC var1) {
      this.id_private();
      super.id_class(var1);
      Po_1 var6 = Po_1.id_break(var1.id_byte());
      this.id_break[id_case[3]] = var6;
      if ((Po_1)this.id_break[id_case[4]] == null) {
         this.id_byte();
      }
   }

   private Sp_1 id_class(Po_1 var1, List<rdn_3> var2) {
      String var3 = "#" + var1.id_class();
      boolean var4 = id_byte[7];

      for (rdn_3 var6 : var2) {
         if (var6.id_break() == rdy_3.dJ) {
            var4 = id_byte[8];

            for (rgP_2 var9 : var6.id_class(null, VU.NORMAL)) {
               String var10 = var9.getString();
               if (var10.contains(id_protected[6])) {
                  String var11 = var10.substring(var10.indexOf(id_catch[1]));
                  if (var11.equals(var3)) {
                     return new Sp_1(this, var6, (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[30]]);
                  }
               }
            }
         }
      }

      return var4 ? new Sp_1(this, null, (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[31]]) : null;
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_private();
      super.id_class(var1);
      SL var2 = this.id_case();
      SC var3 = var2.id_catch();
      if (var3 != null) {
         this.id_case().id_class();
      }

      ((rrfw_3)this.id_break[id_case[5]]).id_class();
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_private();
      super.id_class(var1);
      if ((Po_1)this.id_break[id_case[6]] != null) {
         if (this.id_case().id_catch() instanceof SF var3) {
            long var4 = var3.id_class();
            if (var4 > id_throws[0] && !((rrfw_3)this.id_break[id_case[7]]).id_class((double)var4)) {
               return;
            }
         }

         PK var20 = ((Po_1)this.id_break[id_case[8]]).id_break();
         boolean var21 = var20.id_protected();
         boolean var5 = var20.id_byte();
         boolean var6 = var20.id_throws();
         vm_3 var8 = (vm_3)id_import.id_class[id_case[9]];
         if (var8 instanceof Fc_1 var7) {
            String var22 = var7.id_new().id_byte();
            rqs_3 var9 = var7.G_().id_extends();
            boolean var10 = id_byte[4];
            if (var21) {
               var10 = var22.equalsIgnoreCase(id_protected[3]);
            } else if (var5) {
               var10 = var22.equalsIgnoreCase(id_protected[4]);
            } else if (var6) {
               var10 = var22.equalsIgnoreCase(id_protected[5]);
            }

            if (var10) {
               Sp_1 var11 = this.id_class((Po_1)this.id_break[id_case[18]], var9);
               if (var11 != null) {
                  Sq_1 var12 = var11.id_break();
                  if (var12 == (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[19]]) {
                     rrfu_3.id_byte(
                        "Не удалось найти режим '"
                           + ((Po_1)this.id_break[id_case[20]]).id_break().id_class()
                           + ((Po_1)this.id_break[id_case[21]]).id_class()
                           + "'"
                     );
                     this.id_byte();
                  } else if (var12 == (Sq_1)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[22]]) {
                     rdn_3 var13 = var11.id_class();
                     if (var13 != null) {
                        ((Ax_1)id_import.id_class[id_case[23]])
                           .id_class(
                              ((rJr_1)((cb_3)id_import.id_class[id_case[24]]).id_implements[id_case[25]]).id_case,
                              var9.indexOf(var13),
                              id_byte[5],
                              rXa_1.PICKUP
                           );
                     }
                  }
               } else if (var20.id_protected()) {
                  Sp_1 var23 = this.id_class(var20, var9);
                  if (var23 != null) {
                     rdn_3 var24 = var23.id_class();
                     if (var24 != null) {
                        ((Ax_1)id_import.id_class[id_case[26]])
                           .id_class(
                              ((rJr_1)((cb_3)id_import.id_class[id_case[27]]).id_implements[id_case[28]]).id_case,
                              var9.indexOf(var24),
                              id_byte[6],
                              rXa_1.PICKUP
                           );
                     }
                  }
               }
            }
         } else {
            if ((Integer)((cb_3)id_import.id_class[id_case[10]]).id_throws[id_case[11]] % id_catch[0] == 0) {
               Boolean var18 = id_byte[2];
               this.id_break[id_case[12]] = var18;
            }

            if (!(Boolean)this.id_break[id_case[13]] && !this.id_break(this.id_break())) {
               if (var21) {
                  ((cb_3)id_import.id_class[id_case[14]]).id_case(id_protected[0]);
               } else if (var5) {
                  ((cb_3)id_import.id_class[id_case[15]]).id_case(id_protected[1]);
               } else if (var6) {
                  ((cb_3)id_import.id_class[id_case[16]]).id_protected(id_protected[2]);
               }

               Boolean var19 = id_byte[3];
               this.id_break[id_case[17]] = var19;
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1999677907;
   }

   @Override
   public boolean id_break(String var1) {
      Po_1 var2 = Po_1.id_break(var1);
      if (var2 != null) {
         PK var3 = var2.id_break();
         if (var3 != null) {
            return var3.id_break();
         }
      }

      return id_byte[0];
   }

   @Override
   public String id_throws() {
      Po_1 var1 = C_throws.id_byte().P().id_break();
      if (var1 != null) {
         PK var2 = var1.id_break();
         if (var2 != null) {
            return var2.id_class() + var1.id_class();
         }
      }

      return null;
   }

   private static void id_finally() {
      id_catch = new byte[]{20, 35, 3};
   }

   private static void id_extends() {
      id_throws = new long[1];
   }

   private static void id_implements() {
      id_protected = new String[]{
         new String("/lite"),
         new String("/lite120"),
         new String("/anarchy"),
         new String("Выбор Лайт анархии:"),
         new String("Выберите сервер Лайт:"),
         new String("Выберите Классич. Анархию:"),
         new String("#")
      };
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_catch[2]];
         Object[] var1 = this.id_break;
         var1[id_byte[9]] = id_byte[10];
      }
   }

   private static void id_volatile() {
      id_byte = new boolean[]{false, false, false, true, false, true, true, false, true, false, false};
   }

   private static void id_native() {
      id_case = new short[]{1, 0, 2, 2, 2, 1, 2, 1, 2, 73, 57, 41, 0, 0, 57, 57, 57, 0, 2, 0, 2, 2, 1, 55, 57, 4, 55, 57, 4, 1, 1, 0};
   }
}
