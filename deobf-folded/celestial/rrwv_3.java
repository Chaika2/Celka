package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.StringUtils;

public class rrwv_3 extends vm_3 {
   private static int[] id_case;
   public static Object[] id_class;
   private static boolean[] id_catch;
   private static String[] id_private;
   private static short[] id_implements;
   public Object[] id_throws;
   private static byte[] id_finally;

   private static void id_char() {
      id_private = new String[]{
         new String(""),
         new String(":"),
         new String("ui.proxyserver.options.invalidIpPort"),
         new String(""),
         new String(""),
         new String("ui.proxyserver.options.proxyType"),
         new String("ui.proxyserver.options.auth"),
         new String("ui.proxyserver.options.ipPort"),
         new String("ui.proxyserver.auth.id"),
         new String("ui.proxyserver.auth.username"),
         new String("ui.proxyserver.auth.password"),
         new String("SOCKS4"),
         new String("Socks 4"),
         new String("Socks 5"),
         new String("ui.proxyserver.options.apply"),
         new String("ui.proxyserver.options.test"),
         new String("ui.proxyserver.options.proxyEnabled"),
         new String("ui.proxyserver.options.proxyEnabled"),
         new String("ui.proxyserver.options.cancel"),
         new String(""),
         new String("none"),
         new String("ui.proxyserver.err.specProxy"),
         new String("mc.funtime.su"),
         new String("Socks 4"),
         new String("Socks 5"),
         new String("ui.proxyserver.options.proxy")
      };
   }

   private void id_byte(int var1, int var2, int var3) {
      this.id_finally();
      Integer var11 = this.id_package / 2 - var2 / 2;
      this.id_throws[8] = var11;
      int[] var12 = new int[var1];
      this.id_throws[7] = var12;
      int var4 = (this.id_int + var1 * var3) / 2;
      int var5 = var4 - var1 * var3;

      for (int var6 = id_catch[12]; var6 != var1; var6++) {
         ((int[])this.id_throws[7])[var6] = var5 + var3 * var6;
      }
   }

   private static boolean id_byte(String var0) {
      String[] var1 = var0.split(id_private[1]);
      if (var1.length > 1) {
         if (!StringUtils.isNumeric(var1[1])) {
            return id_catch[3];
         } else {
            try {
               int var2 = Integer.parseInt(var1[1]);
               return var2 >= 0 && var2 <= 65535 ? true : id_catch[6];
            } catch (NumberFormatException var3) {
               return id_catch[7];
            }
         }
      } else {
         return id_catch[8];
      }
   }

   private static void id_int() {
      id_implements = new short[]{
         0,
         0,
         6,
         9,
         5,
         1,
         6,
         1,
         8,
         7,
         7,
         6,
         9,
         0,
         4,
         1,
         4,
         150,
         7,
         7,
         150,
         7,
         1,
         0,
         150,
         7,
         2,
         150,
         7,
         150,
         7,
         2,
         3,
         6,
         6,
         9,
         0,
         7,
         9,
         1,
         2,
         3,
         23,
         160,
         1,
         0,
         8,
         7,
         0,
         8,
         7,
         1,
         1,
         1024,
         1,
         1,
         1,
         8,
         7,
         2,
         2,
         255,
         2,
         1,
         2,
         8,
         7,
         3,
         3,
         255,
         3,
         1,
         3,
         7,
         7,
         7,
         0,
         4,
         4,
         7,
         6,
         23,
         5,
         1,
         1,
         6,
         9,
         9,
         25565,
         0,
         1,
         2,
         3,
         0,
         1,
         2,
         3,
         1,
         4,
         0,
         1,
         0,
         0,
         0,
         0
      };
   }

   public rrwv_3(vm_3 var1) {
      super(new rgN_2((String)id_class[id_implements[0]]));
      this.id_finally();
      Boolean var6 = id_catch[0];
      this.id_throws[id_implements[1]] = var6;
      String var7 = id_private[0];
      this.id_throws[6] = var7;
      rrwJ_2 var8 = new rrwJ_2();
      this.id_throws[9] = var8;
      this.id_throws[5] = var1;
   }

   static {
      ntfClinit();
   }

   private boolean id_interface() {
      this.id_finally();
      if (!id_byte(((Lu_1)this.id_throws[1]).id_private())) {
         String var5 = rgF_2.RED + new rgn_3(id_private[2]).getString();
         this.id_throws[6] = var5;
         ((Lu_1)this.id_throws[1]).id_byte(true);
         return id_catch[10];
      } else {
         return true;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, -95, 81, -99, 44, 58, 4, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_finally();
      this.id_class(var1);
      if (((LC)this.id_throws[4]).id_private() && !id_byte(((Lu_1)this.id_throws[1]).id_private())) {
         ((LC)this.id_throws[4]).id_catch();
      }

      id_break(var1, this.id_super, new rgn_3(id_private[5]).getString(), this.id_package / 2 - 150, ((int[])this.id_throws[7])[1] + 5, 10526880);
      id_class(var1, this.id_super, new rgn_3(id_private[6]).getString(), this.id_package / 2, ((int[])this.id_throws[7])[3] + 8, rgF_2.WHITE.id_protected());
      id_break(var1, this.id_super, new rgn_3(id_private[7]).getString(), this.id_package / 2 - 150, ((int[])this.id_throws[7])[2] + 5, 10526880);
      ((Lu_1)this.id_throws[1]).id_class(var1, var2, var3, var4);
      if ((Boolean)this.id_throws[id_implements[23]]) {
         id_break(var1, this.id_super, new rgn_3(id_private[8]).getString(), this.id_package / 2 - 150, ((int[])this.id_throws[7])[4] + 5, 10526880);
         ((Lu_1)this.id_throws[2]).id_class(var1, var2, var3, var4);
      } else {
         id_break(var1, this.id_super, new rgn_3(id_private[9]).getString(), this.id_package / 2 - 150, ((int[])this.id_throws[7])[4] + 5, 10526880);
         id_break(var1, this.id_super, new rgn_3(id_private[10]).getString(), this.id_package / 2 - 150, ((int[])this.id_throws[7])[5] + 5, 10526880);
         ((Lu_1)this.id_throws[2]).id_class(var1, var2, var3, var4);
         ((Lu_1)this.id_throws[3]).id_class(var1, var2, var3, var4);
      }

      id_class(
         var1,
         this.id_super,
         !((String)this.id_throws[6]).isEmpty() ? (String)this.id_throws[6] : (String)((rrwJ_2)this.id_throws[9]).id_class[id_implements[36]],
         this.id_package / 2,
         ((int[])this.id_throws[7])[6] + 5,
         10526880
      );
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_finally();
      super.id_class(var1, var2, var3);
      String var8 = id_private[3];
      this.id_throws[6] = var8;
      rrwJ_2 var10000 = (rrwJ_2)this.id_throws[9];
      String var9 = id_private[4];
      var10000.id_class[id_implements[13]] = var9;
      return true;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5601165732233054887L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1663554574;
   }

   private void id_finally() {
      if (this.id_throws == null) {
         this.id_throws = new Object[10];
         Object[] var1 = this.id_throws;
         var1[id_catch[21]] = id_catch[22];
         var1[8] = Integer.valueOf(id_catch[23]);
      }
   }

   private static void id_package() {
      id_catch = new boolean[]{
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   @Override
   public void id_private() {
      this.id_finally();
      super.id_private();
      ((rrwJ_2)this.id_throws[9]).id_class();
      ((Lu_1)this.id_throws[1]).id_catch();
      ((Lu_1)this.id_throws[2]).id_catch();
      ((Lu_1)this.id_throws[3]).id_catch();
   }

   private static void id_abstract() {
      Object[] var0 = new Object[]{new String("Proxy")};
      id_class = var0;
   }

   private static void id_final() {
      id_case = new int[]{65535, 10526880, 10526880, 10526880, 10526880, 10526880, 10526880};
   }

   @Override
   public void id_volatile() {
      this.id_finally();
      super.id_volatile();
      String var5 = id_private[19];
      this.id_throws[6] = var5;
      ((Qj_1)this.id_volatile.id_class[23]).id_class(id_catch[17]);
   }

   private static void id_native() {
      id_finally = new byte[]{
         2,
         2,
         2,
         2,
         5,
         2,
         3,
         8,
         2,
         2,
         5,
         2,
         4,
         5,
         2,
         4,
         5,
         2,
         5,
         5,
         2,
         6,
         5,
         10,
         26,
         20,
         2,
         20,
         4,
         20,
         5,
         20,
         2,
         2,
         3,
         2,
         8,
         2,
         3,
         20,
         2,
         3,
         8,
         2,
         3,
         20,
         2,
         15,
         2,
         7,
         20,
         2,
         3,
         2,
         8,
         2,
         3,
         20,
         10,
         8
      };
   }

   @Override
   public void v_() {
      this.id_finally();
      super.v_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      short var1 = 160;
      this.id_byte(10, var1, 26);
      Boolean var11 = ((rrwu_3)rrwZ_2.id_class[1]).id_protected.equals(id_private[11]);
      this.id_throws[id_implements[45]] = var11;
      LF var2 = new LF(
         (Integer)this.id_throws[8],
         ((int[])this.id_throws[7])[1],
         var1,
         20,
         new rgN_2(this.id_throws[id_implements[48]] ? id_private[12] : id_private[13]),
         var1x -> {
            this.id_finally();
            Boolean var6x = !this.id_throws[id_implements[102]] ? true : id_catch[19];
            this.id_throws[id_implements[103]] = var6x;
            var1x.id_break(new rgN_2(this.id_throws[id_implements[104]] ? id_private[23] : id_private[24]));
         }
      );
      this.id_class((LF)var2);
      Lu_1 var12 = new Lu_1(this.id_super, (Integer)this.id_throws[8], ((int[])this.id_throws[7])[2], var1, 20, rgN_2.id_byte);
      this.id_throws[1] = var12;
      ((Lu_1)this.id_throws[1]).id_implements(1024);
      ((Lu_1)this.id_throws[1]).id_class(((rrwu_3)rrwZ_2.id_class[1]).id_break);
      this.id_class((Lu_1)this.id_throws[1]);
      Lu_1 var13 = new Lu_1(this.id_super, (Integer)this.id_throws[8], ((int[])this.id_throws[7])[4], var1, 20, rgN_2.id_byte);
      this.id_throws[2] = var13;
      ((Lu_1)this.id_throws[2]).id_implements(255);
      ((Lu_1)this.id_throws[2]).id_class(((rrwu_3)rrwZ_2.id_class[1]).id_byte);
      this.id_class((Lu_1)this.id_throws[2]);
      Lu_1 var14 = new Lu_1(this.id_super, (Integer)this.id_throws[8], ((int[])this.id_throws[7])[5], var1, 20, rgN_2.id_byte);
      this.id_throws[3] = var14;
      ((Lu_1)this.id_throws[3]).id_implements(255);
      ((Lu_1)this.id_throws[3]).id_class(((rrwu_3)rrwZ_2.id_class[1]).id_class);
      this.id_class((Lu_1)this.id_throws[3]);
      int var3 = this.id_package / 2 - var1 / 2 * 3 / 2;
      LF var4 = new LF(
         var3,
         ((int[])this.id_throws[7])[8],
         var1 / 2 - 3,
         20,
         new rgn_3(id_private[14]),
         var1x -> {
            this.id_finally();
            if (this.id_interface()) {
               rrwu_3 var6x = new rrwu_3(
                  (Boolean)this.id_throws[id_implements[93]],
                  ((Lu_1)this.id_throws[1]).id_private(),
                  ((Lu_1)this.id_throws[2]).id_private(),
                  ((Lu_1)this.id_throws[3]).id_private()
               );
               rrwZ_2.id_class[1] = var6x;
               Boolean var7 = ((LC)this.id_throws[4]).id_private();
               rrwZ_2.id_class[id_implements[99]] = var7;
               rrwN_2.id_class((rrwu_3)rrwZ_2.id_class[1]);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[101]]).id_protected().id_class();
               id_import.id_break(new vG_2(new rrvL()));
            }
         }
      );
      this.id_class((LF)var4);
      LF var5 = new LF(
         var3 + var1 / 2 + 3,
         ((int[])this.id_throws[7])[8],
         var1 / 2 - 3,
         20,
         new rgn_3(id_private[15]),
         var1x -> {
            this.id_finally();
            if (!((Lu_1)this.id_throws[1]).id_private().isEmpty() && !((Lu_1)this.id_throws[1]).id_private().equalsIgnoreCase(id_private[20])) {
               if (this.id_interface()) {
                  rrwJ_2 var7 = new rrwJ_2();
                  this.id_throws[9] = var7;
                  ((rrwJ_2)this.id_throws[9])
                     .id_class(
                        id_private[22],
                        25565,
                        new rrwu_3(
                           (Boolean)this.id_throws[id_implements[89]],
                           ((Lu_1)this.id_throws[1]).id_private(),
                           ((Lu_1)this.id_throws[2]).id_private(),
                           ((Lu_1)this.id_throws[3]).id_private()
                        )
                     );
               }
            } else {
               String var6x = rgF_2.RED + new rgn_3(id_private[21]).getString();
               this.id_throws[6] = var6x;
            }
         }
      );
      this.id_class((LF)var5);
      LC var15 = new LC(
         this.id_package / 2 - (15 + this.id_super.id_class(new rgn_3(id_private[16]))) / 2,
         ((int[])this.id_throws[7])[7],
         var1,
         20,
         new rgn_3(id_private[17]),
         (Boolean)rrwZ_2.id_class[id_implements[76]]
      );
      this.id_throws[4] = var15;
      this.id_class((LC)this.id_throws[4]);
      LF var6 = new LF(var3 + (var1 / 2 + 3) * 2, ((int[])this.id_throws[7])[8], var1 / 2 - 3, 20, new rgn_3(id_private[18]), var1x -> {
         this.id_finally();
         id_import.id_break((vm_3)this.id_throws[5]);
      });
      this.id_class((LF)var6);
   }
}
