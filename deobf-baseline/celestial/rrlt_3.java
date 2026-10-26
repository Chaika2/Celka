package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlt_3 extends rrTF<AutoAccept> {
   private static short[] id_byte;
   public Object[] id_class;
   private static String[] id_protected;
   private static boolean[] id_case;
   public static Object[] id_break;
   private static byte[] id_catch;

   private static void id_byte() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{
         id_protected[5],
         id_protected[6],
         id_protected[7],
         id_protected[8],
         id_protected[9],
         id_protected[10],
         id_protected[11],
         id_protected[12],
         id_protected[13],
         id_protected[14],
         id_protected[15]
      };
      var0[0] = var2;
      id_break = var0;
   }

   public rrlt_3(AutoAccept var1) {
      super(var1);
      this.id_throws();
      rrIk_1 var6 = new rrIk_1(id_protected[0], id_case[0]);
      this.id_class[id_byte[0]] = var6;
      rrIk_1 var7 = new rrIk_1(id_protected[1], id_case[1]);
      this.id_class[id_byte[1]] = var7;
      String var10003 = id_protected[2];
      Setting[] var10004 = new Setting[id_catch[0]];
      var10004[id_case[2]] = (rrIk_1)this.id_class[id_byte[2]];
      var10004[id_case[3]] = (rrIk_1)this.id_class[id_byte[3]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLO var1) {
      this.id_throws();
      if (((rrIk_1)this.id_class[id_byte[4]]).id_class()) {
         String var2 = var1.id_protected().toLowerCase();
         if (!Arrays.<String>stream((String[])id_break[id_byte[5]]).map(String::toLowerCase).noneMatch(var2::contains)) {
            if (this.id_class(var1, var2)) {
               if (rrfZ_2.id_byte()) {
                  rrfu_3.id_byte(rrfu_3.id_class(this.id_continue()) + "Вы находитесь в PvP режиме!");
                  rrlw_3 var7 = (rrlw_3)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[id_byte[6]];
                  this.id_class[id_byte[7]] = var7;
               } else {
                  this.id_case();
               }
            }
         }
      }
   }

   private boolean id_class(rrLO var1, String var2) {
      this.id_throws();
      if (((rrIk_1)this.id_class[id_byte[11]]).id_class()) {
         if (var1.id_class() != null) {
            return id_case[4];
         }

         if (!this.id_continue().id_class(var2.split(id_protected[3]))) {
            return id_case[5];
         }
      }

      return id_case[6];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7725927935175892941L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_throws();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[8]]
         && (rrlw_3)this.id_class[id_byte[9]] == (rrlw_3)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[id_byte[10]]
         && !rrfZ_2.id_byte()) {
         this.id_case();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1804448515;
   }

   private static void id_class() {
      id_protected = new String[]{
         new String("Включено"),
         new String("Только от друзей"),
         new String("Запрос на телепорт"),
         new String("\\s+"),
         new String("/tpaccept"),
         new String("has requested teleport"),
         new String("просит телепортироваться"),
         new String("просит к вам телепортироваться"),
         new String("хочет телепортироваться к вам"),
         new String("запрашивает телепорт к вам"),
         new String("кинул запрос на телепортацию"),
         new String("кинул запрос на телепорт"),
         new String("кинул запрос на тп"),
         new String("кинул запрос на тп к вам"),
         new String("кинул запрос на телепорт к вам"),
         new String("кинул запрос на телепортацию к вам")
      };
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -102, 114, 118, 31, -19, -103, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      this.id_throws();
      ((cb_3)id_import.id_class[id_byte[12]]).id_case(id_protected[4]);
      rrlw_3 var5 = (rrlw_3)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[id_byte[13]];
      this.id_class[id_byte[14]] = var5;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private void id_case() {
      this.id_break();
   }

   private static void id_implements() {
      id_byte = new short[]{0, 1, 0, 1, 0, 0, 0, 2, 0, 2, 0, 1, 57, 1, 2, 2};
   }

   private static void id_protected() {
      id_catch = new byte[]{2, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3};
   }

   private static void id_private() {
      id_case = new boolean[]{true, true, false, true, false, false, true, false, true, false, true};
   }

   @Override
   public boolean aK_() {
      this.id_throws();
      Object var5 = null;
      this.id_class[id_byte[15]] = var5;
      return super.aK_();
   }
}
