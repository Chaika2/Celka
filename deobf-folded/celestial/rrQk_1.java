package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQk_1 implements MinecraftAccessor {
   private static boolean[] booleans9c4062aebf3b3e0dbb68c82ac08880ac;
   public Object[] fields9c4062aebf3b3e0dbb68c82ac08880ac;
   public static Object[] staticFields9c4062aebf3b3e0dbb68c82ac08880ac;
   private static String[] strings9c4062aebf3b3e0dbb68c82ac08880ac;
   private static short[] shorts9c4062aebf3b3e0dbb68c82ac08880ac;
   private static byte[] bytes9c4062aebf3b3e0dbb68c82ac08880ac;

   public void id_byte() {
      if (((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[12]]).isEmpty()) {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(rrQt_1::id_byte);
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[14]]).clear();
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(rrQt_1::id_class);
      }
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-14, -67, -116, 44, -60, 96, 19, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rrQk_1() {
      this.id_throws();
      ArrayList var7 = new ArrayList();
      this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[1]] = var7;
      ArrayList var8 = new ArrayList();
      this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1] = var8;
      ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).add(new rrQw_1());
   }

   static {
      ntfClinit();
   }

   public boolean id_class(rrQx_1 var1, boolean var2, boolean var3) {
      if (var1 != null && var1.id_class() != null && var1.id_class().length() <= 16) {
         boolean var4 = !((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[5]]).contains(var1)
            ? true
            : booleans9c4062aebf3b3e0dbb68c82ac08880ac[2];
         if (var4) {
            if (var3) {
               ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[6]])
                  .add(booleans9c4062aebf3b3e0dbb68c82ac08880ac[3], var1);
            } else {
               ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[7]]).add(var1);
            }
         }

         if (var2) {
            ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var2x -> var2x.id_class(var1, var4));
         }

         return var4;
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(rrQt_1::id_break);
         return booleans9c4062aebf3b3e0dbb68c82ac08880ac[0];
      }
   }

   public boolean id_class(rrQd_1 var1) {
      if (((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[16]])
         .stream()
         .noneMatch(var1x -> var1x.id_break().equals(var1))) {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var1x -> var1x.id_class(var1));
         return booleans9c4062aebf3b3e0dbb68c82ac08880ac[4];
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var1x -> var1x.id_break(var1));
         return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[19]])
            .removeIf(var1x -> var1x.id_break().equals(var1));
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -921999316;
   }

   public void id_class(rrQx_1 var1) {
      var1.id_byte()
         .thenAccept(
            var1x -> {
               String var2 = "Вы успешно авторизовались в аккаунт '"
                  + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts9c4062aebf3b3e0dbb68c82ac08880ac[27]])
                     .id_private()
                     .id_throws()
                     .id_break(var1.id_class())
                  + "'";
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[shorts9c4062aebf3b3e0dbb68c82ac08880ac[28]])
                  .id_class(new rrtQ_2(strings9c4062aebf3b3e0dbb68c82ac08880ac[2], var2, 2000));
            }
         )
         .exceptionally(
            var0 -> {
               String var1x = strings9c4062aebf3b3e0dbb68c82ac08880ac[0];
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[shorts9c4062aebf3b3e0dbb68c82ac08880ac[25]])
                  .id_class(new rrtx_3(strings9c4062aebf3b3e0dbb68c82ac08880ac[1], var1x, 2000));
               return null;
            }
         );
   }

   public List<rrQx_1> id_class() {
      return (List<rrQx_1>)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[23]];
   }

   public rrQx_1 id_class(String var1) {
      return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[20]])
         .stream()
         .filter(var1x -> var1x.id_class().equalsIgnoreCase(var1.toLowerCase()))
         .findFirst()
         .orElse(null);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6623718177039580363L;
   }

   public List<rrQt_1> id_break() {
      return (List<rrQt_1>)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1];
   }

   public void id_break(String var1) {
      rrQx_1 var2 = this.id_class(var1);
      if (var2 == null) {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var1x -> var1x.id_class(var1));
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var3 -> var3.id_break(var2, this.id_protected(var1)));
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[11]]).removeIf(var1x -> var1x.id_class().equals(var1));
      }
   }

   private void id_throws() {
      if (this.fields9c4062aebf3b3e0dbb68c82ac08880ac == null) {
         this.fields9c4062aebf3b3e0dbb68c82ac08880ac = new Object[2];
         Object[] var1 = this.fields9c4062aebf3b3e0dbb68c82ac08880ac;
      }
   }

   private static void id_catch() {
      strings9c4062aebf3b3e0dbb68c82ac08880ac = new String[]{
         new String("Ошибка авторизации в аккаунт"), new String("Accounts"), new String("Accounts"), new String("INSTANCE")
      };
   }

   private static void id_extends() {
      bytes9c4062aebf3b3e0dbb68c82ac08880ac = new byte[]{16, 2, 2};
   }

   private static void id_case() {
      booleans9c4062aebf3b3e0dbb68c82ac08880ac = new boolean[]{false, true, false, false, false, true, false, false, false, true};
   }

   private static void id_implements() {
      shorts9c4062aebf3b3e0dbb68c82ac08880ac = new short[]{1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 2000, 0, 0, 2000, 0};
   }

   public boolean id_protected(String var1) {
      return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[22]])
         .stream()
         .anyMatch(var1x -> var1x.id_class().equals(var1));
   }

   public rrQx_1 id_protected() {
      return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[21]])
         .stream()
         .filter(var0 -> var0.id_class().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase()))
         .findFirst()
         .orElse(null);
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrQk_1(), null};
      var0[1] = new rrQk_1[]{(rrQk_1)var0[0]};
      staticFields9c4062aebf3b3e0dbb68c82ac08880ac = var0;
   }
}
