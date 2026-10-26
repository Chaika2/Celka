package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQC extends vm_3 {
   private static short[] id_case;
   private static double[] id_catch;
   private static int[] id_private;
   public Object[] id_class;
   private static byte[] id_implements;
   private static String[] id_finally;
   private static float[] id_else;
   public static Object[] id_throws;
   private static boolean[] id_synchronized;

   private void id_char() {
      this.id_short();
      rrQn_1 var1 = ((rrQA)this.id_class[id_case[39]]).id_finally();
      if (var1 != null) {
         ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[40]]).id_class(var1.id_private());
      }
   }

   @Override
   public void id_byte(boolean var1) {
      this.id_short();
      ((LF)this.id_class[id_case[37]]).id_int = var1;
      ((LF)this.id_class[id_case[38]]).id_int = var1;
   }

   private static void id_int() {
      id_private = new int[]{16777215};
   }

   private static void id_long() {
      id_synchronized = new boolean[]{
         false,
         false,
         true,
         true,
         true,
         true,
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
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true
      };
   }

   private static void id_float() {
      id_else = new float[]{
         2.0F,
         16.0F,
         16.0F,
         4.0F,
         4.0F,
         4.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         8.0F,
         8.0F,
         20.0F,
         20.0F,
         44.0F,
         20.0F,
         36.0F,
         52.0F,
         4.0F,
         20.0F,
         20.0F,
         52.0F,
         40.0F,
         8.0F,
         44.0F,
         36.0F,
         52.0F,
         52.0F,
         4.0F,
         36.0F,
         4.0F,
         52.0F
      };
   }

   public rrQC(vm_3 var1) {
      super(new rgn_3(id_finally[0]));
      this.id_short();
      Av_1 var6 = new Av_1();
      this.id_class[id_case[0]] = var6;
      this.id_class[id_case[1]] = var1;
      ArrayList var8 = new ArrayList();
      this.id_class[id_case[2]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_finally = new String[]{
         new String("account.switcher.title"),
         new String(","),
         new String("[ \"]"),
         new String(""),
         new String("account.switcher.randomaccount"),
         new String("account.switcher.deleteallrandom"),
         new String("account.switcher.findaccount"),
         new String("..."),
         new String("account.switcher.add"),
         new String("account.switcher.delete"),
         new String("account.switcher.login"),
         new String("uuid_list.txt")
      };
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_short();
      if (vm_3.id_case(var1)) {
         boolean var4 = id_synchronized[0];
         String[] var5 = ((Qj_1)this.id_volatile.id_class[id_case[7]]).id_class().split(id_finally[1]);
         if (var5 != null) {
            String[] var6 = var5;
            int var7 = var5.length;

            for (int var8 = id_synchronized[1]; var8 < var7; var8++) {
               String var9 = var6[var8];
               var9 = var9.replaceAll(id_finally[2], id_finally[3]);
               if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[8]])
                  .id_class(
                     new rrQQ(var9, rrQV.id_class(var9), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[9]]),
                     id_synchronized[2],
                     id_synchronized[3]
                  )) {
                  this.id_native();
                  var4 = id_synchronized[4];
               }
            }
         }

         if (var4) {
            return id_synchronized[5];
         }
      } else if (vm_3.id_catch(var1)) {
         rrQn_1 var10 = ((rrQA)this.id_class[id_case[10]]).id_finally();
         if (var10 != null) {
            ((Qj_1)this.id_volatile.id_class[id_case[11]]).id_class(var10.id_private().id_class());
            return id_synchronized[6];
         }
      }

      return !super.id_class(var1, var2, var3) && !((rrQA)this.id_class[id_case[12]]).id_class(var1, var2, var3) ? id_synchronized[8] : id_synchronized[7];
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_short();
      this.id_class(var1);
      ((rrQA)this.id_class[id_case[3]]).id_class(var1, var2, var3, var4);
      ((Lu_1)this.id_class[id_case[4]]).id_class(var1, var2, var3, var4);

      for (rrQT var6 : (List)this.id_class[id_case[5]]) {
         var6.id_class(var1, var2, var3, var4);
      }

      id_class(
         var1,
         this.id_super,
         this.id_extends.id_case().id_break(" (" + id_import.id_while().id_byte() + ")"),
         this.id_package / id_implements[0],
         id_implements[1],
         id_private[0]
      );
      ((rrQA)this.id_class[id_case[6]])
         .id_private()
         .ifPresent(
            var2x -> {
               boolean var3x = var2x.id_class();
               rqO_2 var4x = var2x.id_break();
               var1.id_class();
               var1.id_class(id_else[3], id_else[4], id_else[5]);
               var1.id_class(id_catch[0], (double)this.id_int / id_catch[1] - id_catch[2] - id_catch[3], id_catch[4]);
               RenderSystem.color4f(id_else[6], id_else[7], id_else[8], id_else[9]);
               id_import.A().id_class(var4x);
               vm_3.id_class(
                  var1,
                  id_implements[27],
                  id_synchronized[17],
                  id_else[10],
                  id_else[11],
                  id_implements[28],
                  id_implements[29],
                  id_implements[30],
                  id_implements[31]
               );
               vm_3.id_class(
                  var1,
                  id_implements[32],
                  id_implements[33],
                  id_else[12],
                  id_else[13],
                  id_implements[34],
                  id_implements[35],
                  id_implements[36],
                  id_implements[37]
               );
               vm_3.id_class(
                  var1,
                  var3x ? id_synchronized[18] : id_synchronized[19],
                  id_implements[38],
                  id_else[14],
                  id_else[15],
                  var3x ? id_implements[39] : id_implements[40],
                  id_implements[41],
                  id_implements[42],
                  id_implements[43]
               );
               vm_3.id_class(
                  var1,
                  id_implements[44],
                  id_implements[45],
                  id_else[16],
                  id_else[17],
                  var3x ? id_implements[46] : id_implements[47],
                  id_implements[48],
                  id_implements[49],
                  id_implements[50]
               );
               vm_3.id_class(
                  var1,
                  id_implements[51],
                  id_implements[52],
                  id_else[18],
                  id_else[19],
                  id_implements[53],
                  id_implements[54],
                  id_implements[55],
                  id_implements[56]
               );
               vm_3.id_class(
                  var1,
                  id_implements[57],
                  id_implements[58],
                  id_else[20],
                  id_else[21],
                  id_implements[59],
                  id_implements[60],
                  id_implements[61],
                  id_implements[62]
               );
               if (((Qw_1)this.id_volatile.id_class[id_case[52]]).id_break(rhQ_2.HAT)) {
                  vm_3.id_class(
                     var1,
                     id_implements[63],
                     id_synchronized[20],
                     id_else[22],
                     id_else[23],
                     id_implements[64],
                     id_implements[65],
                     id_implements[66],
                     id_implements[67]
                  );
               }

               if (((Qw_1)this.id_volatile.id_class[id_case[53]]).id_break(rhQ_2.RIGHT_SLEEVE)) {
                  vm_3.id_class(
                     var1,
                     var3x ? id_synchronized[21] : id_synchronized[22],
                     id_implements[68],
                     id_else[24],
                     id_else[25],
                     var3x ? id_implements[69] : id_implements[70],
                     id_implements[71],
                     id_implements[72],
                     id_implements[73]
                  );
               }

               if (((Qw_1)this.id_volatile.id_class[id_case[54]]).id_break(rhQ_2.LEFT_SLEEVE)) {
                  vm_3.id_class(
                     var1,
                     id_implements[74],
                     id_implements[75],
                     id_else[26],
                     id_else[27],
                     var3x ? id_implements[76] : id_implements[77],
                     id_implements[78],
                     id_implements[79],
                     id_implements[80]
                  );
               }

               if (((Qw_1)this.id_volatile.id_class[id_case[55]]).id_break(rhQ_2.RIGHT_PANTS_LEG)) {
                  vm_3.id_class(
                     var1,
                     id_implements[81],
                     id_implements[82],
                     id_else[28],
                     id_else[29],
                     id_implements[83],
                     id_implements[84],
                     id_implements[85],
                     id_implements[86]
                  );
               }

               if (((Qw_1)this.id_volatile.id_class[id_case[56]]).id_break(rhQ_2.LEFT_PANTS_LEG)) {
                  vm_3.id_class(
                     var1,
                     id_implements[87],
                     id_implements[88],
                     id_else[30],
                     id_else[31],
                     id_implements[89],
                     id_implements[90],
                     id_implements[91],
                     id_implements[92]
                  );
               }

               var1.id_break();
            }
         );
      super.id_class(var1, var2, var3, var4);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-118, 58, -93, -89, 0, -14, 118, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrQx_1 var1) {
      ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[36]]).id_break(var1.id_class());
      this.id_native();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6284359710662226713L;
   }

   private void id_short() {
      if (this.id_class == null) {
         this.id_class = new Object[id_implements[96]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_void() {
      Object[] var0 = new Object[]{
         (new rgn_3(id_finally[6])).id_class(new rgN_2("...")),
         new rgn_3(id_finally[8]),
         new rgn_3(id_finally[9]),
         new rgn_3(id_finally[10]),
         new rrQL(id_finally[11])
      };
      id_throws = var0;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 443458071;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_short();

      for (rrQT var7 : (List)this.id_class[id_case[29]]) {
         if (var7.id_class(var1, var3, var5)) {
            return id_synchronized[13];
         }
      }

      return super.id_break(var1, var3, var5);
   }

   public void id_finally() {
      this.id_short();
      ((rrQA)this.id_class[id_case[35]]).id_private().ifPresent(var1 -> this.id_class(var1.id_private()));
   }

   private static void id_import() {
      id_case = new short[]{
         3,
         0,
         2,
         1,
         4,
         2,
         1,
         23,
         0,
         0,
         1,
         23,
         1,
         23,
         0,
         2,
         200,
         4,
         0,
         0,
         4,
         1,
         4,
         150,
         3,
         5,
         2,
         6,
         1,
         2,
         23,
         1,
         1,
         0,
         4,
         1,
         0,
         6,
         5,
         1,
         0,
         1,
         4,
         3,
         0,
         1,
         4,
         0,
         1,
         0,
         1,
         4,
         20,
         20,
         20,
         20,
         20
      };
   }

   private static void id_package() {
      id_implements = new byte[]{
         2,
         8,
         2,
         20,
         2,
         100,
         22,
         20,
         16,
         48,
         64,
         16,
         2,
         2,
         4,
         52,
         20,
         28,
         20,
         52,
         20,
         28,
         20,
         52,
         20,
         28,
         20,
         4,
         8,
         8,
         64,
         64,
         4,
         8,
         8,
         12,
         64,
         64,
         8,
         3,
         4,
         12,
         64,
         64,
         12,
         8,
         3,
         4,
         12,
         64,
         64,
         4,
         20,
         4,
         12,
         64,
         64,
         8,
         20,
         4,
         12,
         64,
         64,
         4,
         8,
         8,
         64,
         64,
         8,
         3,
         4,
         12,
         64,
         64,
         12,
         8,
         3,
         4,
         12,
         64,
         64,
         4,
         20,
         4,
         12,
         64,
         64,
         8,
         20,
         4,
         12,
         64,
         64,
         2,
         3,
         4,
         7,
         5
      };
   }

   private static void id_static() {
      id_catch = new double[]{1.0, 8.0, 16.0, 4.0, 0.0};
   }

   @Override
   public void id_private() {
      this.id_short();
      super.id_private();
      ((Lu_1)this.id_class[id_case[34]]).id_catch();
   }

   private void id_abstract() {
      id_import.id_break(new rrQl_1(this, this));
   }

   public Av_1 id_final() {
      this.id_short();
      return (Av_1)this.id_class[id_case[43]];
   }

   public void id_native() {
      this.id_short();
      ((rrQA)this.id_class[id_case[41]]).id_class(((Lu_1)this.id_class[id_case[42]]).id_private());
   }

   @Override
   public void v_() {
      this.id_short();
      super.v_();
      ((Qj_1)this.id_volatile.id_class[id_case[13]]).id_class(id_synchronized[9]);
      ArrayList var1 = new ArrayList();

      for (rrwp_3 var3 : ((rrwq_3)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[id_case[14]]).id_class()) {
         var1.add(new rrQT(this, var3));
      }

      for (int var13 = id_synchronized[10]; var13 < var1.size(); var13++) {
         rrQT var15 = (rrQT)var1.get(var13);
         var15.id_class(new rruv_1((float)(id_implements[2] + var13 * id_implements[3]), id_else[0], id_else[1], id_else[2]));
         ((List)this.id_class[id_case[15]]).add(var15);
      }

      Lu_1 var9 = this.id_class(
         new Lu_1(
               this.id_super,
               this.id_package / id_implements[4] - id_implements[5],
               id_implements[6],
               id_case[16],
               id_implements[7],
               (Lu_1)this.id_class[id_case[17]],
               (rVi_1)id_throws[id_case[18]],
               id_synchronized[11]
            )
            .id_class((rVi_1)id_throws[id_case[19]])
            .id_implements(id_implements[8])
      );
      this.id_class[id_case[20]] = var9;
      rrQA var10 = this.id_protected(
         new rrQA(this, this.id_volatile, this.id_package, this.id_int, id_implements[9], this.id_int - id_implements[10], id_implements[11])
      );
      this.id_class[id_case[21]] = var10;
      ((Lu_1)this.id_class[id_case[22]]).id_class(var1x -> {
         this.id_short();
         ((rrQA)this.id_class[id_case[50]]).id_class(((Lu_1)this.id_class[id_case[51]]).id_private());
      });
      short var14 = id_case[23];
      int var16 = this.id_package / id_implements[12] - var14 - var14 / id_implements[13];
      byte var4 = id_implements[14];
      LF var11 = this.id_class(
         (LF)(new LF(var16, this.id_int - id_implements[15], var14, id_implements[16], (rgn_3)id_throws[id_case[24]], var1x -> this.id_char()))
      );
      this.id_class[id_case[25]] = var11;
      LF var12 = this.id_class(
         (LF)(new LF(var16, this.id_int - id_implements[17], var14, id_implements[18], (rgn_3)id_throws[id_case[26]], var1x -> this.id_finally()))
      );
      this.id_class[id_case[27]] = var12;
      var16 += var14 + var4;
      this.id_class((LF)(new LF(var16, this.id_int - id_implements[19], var14, id_implements[20], (rgn_3)id_throws[id_case[28]], var1x -> this.id_abstract())));
      this.id_class((LF)(new LF(var16, this.id_int - id_implements[21], var14, id_implements[22], cN_2.id_protected, var1x -> {
         this.id_short();
         this.id_volatile.id_break((vm_3)this.id_class[id_case[49]]);
      })));
      var16 += var14 + var4;
      this.id_class(
         (LF)(new LF(
            var16,
            this.id_int - id_implements[23],
            var14,
            id_implements[24],
            new rgn_3(id_finally[4]),
            var1x -> {
               CompletableFuture var2 = ((rrQF)id_throws[id_case[46]]).id_class();
               if (var2 != null) {
                  var2.thenAccept(
                     var1xx -> {
                        if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[47]])
                           .id_class(
                              new rrQQ(var1xx, rrQV.id_class(var1xx), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[48]]),
                              id_synchronized[15],
                              id_synchronized[16]
                           )) {
                           this.id_native();
                        }
                     }
                  );
               }
            }
         ))
      );
      this.id_class(
         (LF)(new LF(
            var16,
            this.id_int - id_implements[25],
            var14,
            id_implements[26],
            new rgn_3(id_finally[5]),
            var1x -> {
               if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[44]])
                  .id_class((rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[45]])) {
                  this.id_native();
               }
            }
         ))
      );
      this.id_byte(id_synchronized[12]);
      this.id_native();
   }

   @Override
   public void w_() {
      this.id_short();
      super.w_();
      ((Qj_1)this.id_volatile.id_class[id_case[30]]).id_class(id_synchronized[14]);
      if ((rrQA)this.id_class[id_case[31]] != null) {
         ((rrQA)this.id_class[id_case[32]]).x_().forEach(rrQn_1::close);
      }

      for (rrQx_1 var2 : ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[33]]).id_class()) {
         if (var2 instanceof AutoCloseable) {
            AutoCloseable var3 = (AutoCloseable)var2;

            try {
               var3.close();
            } catch (Exception var5) {
            }
         }
      }
   }
}
