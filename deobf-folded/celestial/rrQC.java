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
      rrQn_1 var1 = ((rrQA)this.id_class[1]).id_finally();
      if (var1 != null) {
         ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[40]]).id_class(var1.id_private());
      }
   }

   @Override
   public void id_byte(boolean var1) {
      this.id_short();
      ((LF)this.id_class[6]).id_int = var1;
      ((LF)this.id_class[5]).id_int = var1;
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
      this.id_class[3] = var6;
      this.id_class[id_case[1]] = var1;
      ArrayList var8 = new ArrayList();
      this.id_class[2] = var8;
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
         String[] var5 = ((Qj_1)this.id_volatile.id_class[23]).id_class().split(id_finally[1]);
         if (var5 != null) {
            String[] var6 = var5;
            int var7 = var5.length;

            for (int var8 = id_synchronized[1]; var8 < var7; var8++) {
               String var9 = var6[var8];
               var9 = var9.replaceAll(id_finally[2], id_finally[3]);
               if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[8]])
                  .id_class(new rrQQ(var9, rrQV.id_class(var9), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[9]]), true, true)) {
                  this.id_native();
                  var4 = true;
               }
            }
         }

         if (var4) {
            return true;
         }
      } else if (vm_3.id_catch(var1)) {
         rrQn_1 var10 = ((rrQA)this.id_class[1]).id_finally();
         if (var10 != null) {
            ((Qj_1)this.id_volatile.id_class[23]).id_class(var10.id_private().id_class());
            return true;
         }
      }

      return !super.id_class(var1, var2, var3) && !((rrQA)this.id_class[1]).id_class(var1, var2, var3) ? id_synchronized[8] : true;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_short();
      this.id_class(var1);
      ((rrQA)this.id_class[1]).id_class(var1, var2, var3, var4);
      ((Lu_1)this.id_class[4]).id_class(var1, var2, var3, var4);

      for (rrQT var6 : (List)this.id_class[2]) {
         var6.id_class(var1, var2, var3, var4);
      }

      id_class(var1, this.id_super, this.id_extends.id_case().id_break(" (" + id_import.id_while().id_byte() + ")"), this.id_package / 2, 8, 16777215);
      ((rrQA)this.id_class[1]).id_private().ifPresent(var2x -> {
         boolean var3x = var2x.id_class();
         rqO_2 var4x = var2x.id_break();
         var1.id_class();
         var1.id_class(4.0F, 4.0F, 4.0F);
         var1.id_class(1.0, (double)this.id_int / 8.0 - 16.0 - 4.0, id_catch[4]);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         id_import.A().id_class(var4x);
         vm_3.id_class(var1, 4, id_synchronized[17], 8.0F, 8.0F, 8, 8, 64, 64);
         vm_3.id_class(var1, 4, 8, 20.0F, 20.0F, 8, 12, 64, 64);
         vm_3.id_class(var1, var3x ? 1 : id_synchronized[19], 8, 44.0F, 20.0F, var3x ? 3 : 4, 12, 64, 64);
         vm_3.id_class(var1, 12, 8, 36.0F, 52.0F, var3x ? 3 : 4, 12, 64, 64);
         vm_3.id_class(var1, 4, 20, 4.0F, 20.0F, 4, 12, 64, 64);
         vm_3.id_class(var1, 8, 20, 20.0F, 52.0F, 4, 12, 64, 64);
         if (((Qw_1)this.id_volatile.id_class[20]).id_break(rhQ_2.HAT)) {
            vm_3.id_class(var1, 4, id_synchronized[20], 40.0F, 8.0F, 8, 8, 64, 64);
         }

         if (((Qw_1)this.id_volatile.id_class[20]).id_break(rhQ_2.RIGHT_SLEEVE)) {
            vm_3.id_class(var1, var3x ? 1 : id_synchronized[22], 8, 44.0F, 36.0F, var3x ? 3 : 4, 12, 64, 64);
         }

         if (((Qw_1)this.id_volatile.id_class[20]).id_break(rhQ_2.LEFT_SLEEVE)) {
            vm_3.id_class(var1, 12, 8, 52.0F, 52.0F, var3x ? 3 : 4, 12, 64, 64);
         }

         if (((Qw_1)this.id_volatile.id_class[20]).id_break(rhQ_2.RIGHT_PANTS_LEG)) {
            vm_3.id_class(var1, 4, 20, 4.0F, 36.0F, 4, 12, 64, 64);
         }

         if (((Qw_1)this.id_volatile.id_class[20]).id_break(rhQ_2.LEFT_PANTS_LEG)) {
            vm_3.id_class(var1, 8, 20, 4.0F, 52.0F, 4, 12, 64, 64);
         }

         var1.id_break();
      });
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
         this.id_class = new Object[7];
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

      for (rrQT var7 : (List)this.id_class[2]) {
         if (var7.id_class(var1, var3, var5)) {
            return true;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   public void id_finally() {
      this.id_short();
      ((rrQA)this.id_class[1]).id_private().ifPresent(var1 -> this.id_class(var1.id_private()));
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
      ((Lu_1)this.id_class[4]).id_catch();
   }

   private void id_abstract() {
      id_import.id_break(new rrQl_1(this, this));
   }

   public Av_1 id_final() {
      this.id_short();
      return (Av_1)this.id_class[3];
   }

   public void id_native() {
      this.id_short();
      ((rrQA)this.id_class[1]).id_class(((Lu_1)this.id_class[4]).id_private());
   }

   @Override
   public void v_() {
      this.id_short();
      super.v_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      ArrayList var1 = new ArrayList();

      for (rrwp_3 var3 : ((rrwq_3)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[id_case[14]]).id_class()) {
         var1.add(new rrQT(this, var3));
      }

      for (int var13 = id_synchronized[10]; var13 < var1.size(); var13++) {
         rrQT var15 = (rrQT)var1.get(var13);
         var15.id_class(new rruv_1((float)(2 + var13 * 20), 2.0F, 16.0F, 16.0F));
         ((List)this.id_class[2]).add(var15);
      }

      Lu_1 var9 = this.id_class(
         new Lu_1(this.id_super, this.id_package / 2 - 100, 22, 200, 20, (Lu_1)this.id_class[4], (rVi_1)id_throws[id_case[18]], true)
            .id_class((rVi_1)id_throws[id_case[19]])
            .id_implements(16)
      );
      this.id_class[4] = var9;
      rrQA var10 = this.id_protected(new rrQA(this, this.id_volatile, this.id_package, this.id_int, 48, this.id_int - 64, 16));
      this.id_class[1] = var10;
      ((Lu_1)this.id_class[4]).id_class(var1x -> {
         this.id_short();
         ((rrQA)this.id_class[1]).id_class(((Lu_1)this.id_class[4]).id_private());
      });
      short var14 = 150;
      int var16 = this.id_package / 2 - var14 - var14 / 2;
      byte var4 = 4;
      LF var11 = this.id_class((LF)(new LF(var16, this.id_int - 52, var14, 20, (rgn_3)id_throws[3], var1x -> this.id_char())));
      this.id_class[5] = var11;
      LF var12 = this.id_class((LF)(new LF(var16, this.id_int - 28, var14, 20, (rgn_3)id_throws[2], var1x -> this.id_finally())));
      this.id_class[6] = var12;
      var16 += var14 + var4;
      this.id_class((LF)(new LF(var16, this.id_int - 52, var14, 20, (rgn_3)id_throws[1], var1x -> this.id_abstract())));
      this.id_class((LF)(new LF(var16, this.id_int - 28, var14, 20, cN_2.id_protected, var1x -> {
         this.id_short();
         this.id_volatile.id_break((vm_3)this.id_class[id_case[49]]);
      })));
      var16 += var14 + var4;
      this.id_class(
         (LF)(new LF(
            var16,
            this.id_int - 52,
            var14,
            20,
            new rgn_3(id_finally[4]),
            var1x -> {
               CompletableFuture var2 = ((rrQF)id_throws[4]).id_class();
               if (var2 != null) {
                  var2.thenAccept(
                     var1xx -> {
                        if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[47]])
                           .id_class(new rrQQ(var1xx, rrQV.id_class(var1xx), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[1]), true, true)) {
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
            this.id_int - 28,
            var14,
            20,
            new rgn_3(id_finally[5]),
            var1x -> {
               if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[44]])
                  .id_class((rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[1])) {
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
      ((Qj_1)this.id_volatile.id_class[23]).id_class(id_synchronized[14]);
      if ((rrQA)this.id_class[1] != null) {
         ((rrQA)this.id_class[1]).x_().forEach(rrQn_1::close);
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
