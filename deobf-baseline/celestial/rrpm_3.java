package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpm_3 extends rrTF<FtHelper> {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static short[] id_case;
   public Object[] id_class;

   public rrpv_3 id_byte(String var1) {
      if (rql_3.id_break(var1)) {
         return null;
      } else {
         Matcher var2 = ((Pattern)rrjS_2.id_class[id_case[20]]).matcher(var1);
         return var2.matches() ? rrpv_3.id_break(var2.group(id_byte[9])) : null;
      }
   }

   private static void id_byte() {
      id_byte = new boolean[]{false, false, false, false, false, false, true, true, false, true, true, true, false};
   }

   public rrpm_3(FtHelper var1, GroupSetting var2) {
      super(var1);
      this.id_case();
      rrIk_1 var7 = new rrIk_1(id_protected[0], id_byte[0]);
      this.id_class[id_case[0]] = var7;
      var2.id_class((rrIk_1)this.id_class[id_case[1]]);
   }

   static {
      ntfClinit();
   }

   public void id_class() {
      this.id_private();
   }

   public void id_class(rrpZ_2 var1, rrpZ_2 var2) {
      this.id_break(var1);
      rVi_1 var3 = rrfu_3.id_break(this.id_continue()).id_class(id_protected[1]).id_class(rgF_2.GRAY);
      var3.id_break(id_protected[2]).id_class(new rgN_2(var2.id_break().id_class()).id_class(rgF_2.RED));
      var3.id_break(id_protected[3]).id_class(new rgN_2(this.id_class(var2)).id_class(rgF_2.RED));
      rrfu_3.id_class(var3);
      MinecraftAccessor.a_(var3.id_byte(), id_byte[8]);
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_class();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_case();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[2]]) {
         if (!((rrIk_1)this.id_class[id_case[3]]).id_class() || !rrjS_2.id_class() || !this.id_break()) {
            this.id_class();
            return;
         }

         if ((rrpZ_2)this.id_class[id_case[4]] == null) {
            return;
         }

         UUID var2 = ((rrpZ_2)this.id_class[id_case[5]]).id_class();
         rrpv_3 var3 = ((rrpZ_2)this.id_class[id_case[6]]).id_break();
         rgN_2 var4 = new rgN_2("Шахта: " + var3.id_byte() + var3.id_class() + rgF_2.RESET + " (" + this.id_class((rrpZ_2)this.id_class[id_case[7]]) + ")");
         ((cq_3)id_import.id_class[id_case[8]])
            .id_extends()
            .id_catch()
            .put(
               var2,
               new cd_3(
                  var2,
                  var4,
                  var3.id_break(),
                  rRM.PROGRESS,
                  (float)((rrpZ_2)this.id_class[id_case[9]]).id_protected() / (float)((rrpZ_2)this.id_class[id_case[10]]).id_byte(),
                  id_byte[1],
                  id_byte[2],
                  id_byte[3]
               )
            );
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1711212430;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -108, -18, -71, 16, 35, 17, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private String id_class(rrpZ_2 var1) {
      int var10000 = var1.id_protected() / id_break[9];
      String var10001 = id_protected[4];
      Object[] var10002 = new Object[id_byte[11]];
      var10002[id_byte[12]] = var1.id_protected() % id_break[10];
      return var10000 + ":" + String.format(var10001, var10002);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -745764794633557559L;
   }

   public boolean id_break() {
      this.id_case();
      rrpv_3 var1 = null;
      int var2 = id_break[0];

      for (an_3 var4 : ((gm_3)id_import.id_class[id_case[11]]).id_byte()) {
         if (var4.BC() == aI_2.id_break) {
            String var5 = var4.L_().getString();
            rrpv_3 var6 = this.id_byte(var5);
            if (var6 != null) {
               var1 = var6;
            }

            int var7 = this.id_break(var5);
            if (var7 != id_break[1]) {
               var2 = var7;
            }
         }

         if (var1 != null && var2 != id_break[2]) {
            break;
         }
      }

      if (var1 != null && var2 != id_break[3]) {
         rrpZ_2 var14 = (rrpZ_2)this.id_class[id_case[12]];
         boolean var15 = id_byte[5];
         if ((rrpZ_2)this.id_class[id_case[13]] != null && Math.abs(((rrpZ_2)this.id_class[id_case[14]]).id_protected() - var2) > id_break[4]) {
            Object var12 = null;
            this.id_class[id_case[15]] = var12;
            var15 = id_byte[6];
         }

         if ((rrpZ_2)this.id_class[id_case[16]] == null) {
            rrpZ_2 var13 = new rrpZ_2(UUID.randomUUID(), var2);
            this.id_class[id_case[17]] = var13;
         }

         ((rrpZ_2)this.id_class[id_case[18]]).id_class(var1, var2);
         if (var15) {
            this.id_class(var14, (rrpZ_2)this.id_class[id_case[19]]);
         }

         return id_byte[7];
      } else {
         return id_byte[4];
      }
   }

   public int id_break(String var1) {
      if (rql_3.id_break(var1)) {
         return id_break[5];
      } else {
         Matcher var2 = ((Pattern)rrjS_2.id_class[id_case[21]]).matcher(var1);
         if (var2.matches()) {
            int var3 = Integer.parseInt(var2.group(id_byte[10]));
            int var4 = Integer.parseInt(var2.group(id_break[6]));
            return var3 * id_break[7] + var4;
         } else {
            return id_break[8];
         }
      }
   }

   private void id_break(rrpZ_2 var1) {
      if (var1 != null) {
         ((cq_3)id_import.id_class[id_case[25]]).id_extends().id_catch().remove(var1.id_class());
      }
   }

   private static void id_throws() {
      id_protected = new String[]{
         new String("Отображать информацию\nо шахте в виде боссбара"),
         new String("Произошло обновление шахты"),
         new String("\n • Уровень: "),
         new String("\n • Осталось: "),
         new String("%02d")
      };
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   private static void id_implements() {
      id_case = new short[]{0, 0, 0, 0, 1, 1, 1, 1, 19, 1, 1, 56, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 1, 1, 1, 19};
   }

   private static void id_protected() {
      id_break = new byte[]{-1, -1, -1, -1, 20, -1, 2, 60, -1, 60, 60, 2};
   }

   private void id_private() {
      this.id_case();
      if ((rrpZ_2)this.id_class[id_case[22]] != null) {
         this.id_break((rrpZ_2)this.id_class[id_case[23]]);
         Object var5 = null;
         this.id_class[id_case[24]] = var5;
      }
   }

   @Override
   public boolean aK_() {
      this.id_class();
      return super.aK_();
   }
}
