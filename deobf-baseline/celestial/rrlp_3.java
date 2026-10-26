package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlp_3 extends rrTF<AutoAccept> {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static short[] id_case;
   public static Object[] id_break;
   private static String[] id_catch;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   public rrlp_3(AutoAccept var1) {
      super(var1);
      this.id_byte();
      rrIk_1 var6 = new rrIk_1(id_catch[0], id_protected[0]);
      this.id_class[id_case[0]] = var6;
      rrIk_1 var7 = new rrIk_1(id_catch[1], id_protected[1]);
      this.id_class[id_case[1]] = var7;
      String var10003 = id_catch[2];
      Setting[] var10004 = new Setting[id_byte[0]];
      var10004[id_protected[2]] = (rrIk_1)this.id_class[id_case[2]];
      var10004[id_protected[3]] = (rrIk_1)this.id_class[id_case[3]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-19, 109, -64, -110, -72, 61, -31, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLO var1) {
      this.id_byte();
      if (((rrIk_1)this.id_class[id_case[4]]).id_class()) {
         Aw_1 var2 = var1.id_break();
         if (var2 != null) {
            String var3 = var1.id_protected().toLowerCase();
            if (!Arrays.<String>stream((String[])id_break[id_case[5]]).map(String::toLowerCase).noneMatch(var3::contains)) {
               String var4 = var2.id_class().getName();
               if (this.id_class(var1, var4)) {
                  this.id_break(var4);
               }
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1234588252949324408L;
   }

   private boolean id_class(rrLO var1, String var2) {
      this.id_byte();
      if (((rrIk_1)this.id_class[id_case[6]]).id_class()) {
         if (var1.id_class() != null) {
            return id_protected[4];
         }

         if (!((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_case[7]]).id_break(var2)) {
            return id_protected[5];
         }
      }

      return id_protected[6];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 39901517;
   }

   private static void id_class() {
      id_protected = new boolean[]{true, true, false, true, false, false, true, true, false, false, true};
   }

   private void id_break(String var1) {
      ((cb_3)id_import.id_class[id_case[8]]).id_case("/clan accept " + var1);
   }

   private static void id_break() {
      id_case = new short[]{0, 1, 0, 1, 0, 0, 1, 0, 57};
   }

   private static void id_throws() {
      id_catch = new String[]{new String("Включено"), new String("Только от друзей"), new String("Запрос в клан"), new String("приглашает вас в клан")};
   }

   private static void id_case() {
      id_byte = new byte[]{2, 2};
   }

   private static void id_protected() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{id_catch[3]};
      var0[0] = var2;
      id_break = var0;
   }
}
