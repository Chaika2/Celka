package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryd_1 implements MinecraftAccessor {
   public static Object[] staticFields78f62b0b61073300aba99f31bcf5126e;
   private static boolean[] booleans78f62b0b61073300aba99f31bcf5126e;
   private static short[] shorts78f62b0b61073300aba99f31bcf5126e;
   private static String[] strings78f62b0b61073300aba99f31bcf5126e;
   public Object[] fields78f62b0b61073300aba99f31bcf5126e;
   private static byte[] bytes78f62b0b61073300aba99f31bcf5126e;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, -86, 119, -114, -82, -96, -67, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rryz_1> id_byte() {
      return (List<rryz_1>)this.fields78f62b0b61073300aba99f31bcf5126e[1];
   }

   private rryd_1() {
      this.id_implements();
      HashSet var7 = new HashSet();
      this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[1]] = var7;
      ArrayList var8 = new ArrayList();
      this.fields78f62b0b61073300aba99f31bcf5126e[1] = var8;
      this.id_class(new rryW());
   }

   static {
      ntfClinit();
   }

   public void id_class(String var1, String var2, boolean var3, boolean var4) {
      if (var1.equalsIgnoreCase(id_import.id_while().id_byte())) {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::id_byte);
      } else {
         if (var4) {
            for (rryk_1 var6 : (Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[4]]) {
               if (var6.id_break().equalsIgnoreCase(var1.toLowerCase())) {
                  ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var1x -> var1x.id_class(var1, booleans78f62b0b61073300aba99f31bcf5126e[0]));
                  return;
               }
            }
         }

         boolean var7 = ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[6]]).add(new rryk_1(var1, var2));
         if (var3) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var2x -> var2x.id_class(var1, var7));
         }
      }
   }

   public void id_class(Consumer<rryk_1> var1) {
      if (((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[15]]).isEmpty()) {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::id_break);
      } else {
         ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[17]]).forEach(var1);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1003116860;
   }

   public int id_class() {
      return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[20]]).size();
   }

   public void id_class(boolean var1) {
      if (((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[11]]).isEmpty()) {
         if (var1) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::id_break);
         }
      } else {
         ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[13]]).clear();
         if (var1) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::id_class);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7387091375054086736L;
   }

   public boolean id_class(String var1) {
      return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[18]])
         .stream()
         .anyMatch(var1x -> var1x.id_break().equalsIgnoreCase(var1));
   }

   public void id_class(rryz_1 var1) {
      ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).add(var1);
   }

   public void id_break(String var1) {
      rryk_1 var2 = this.id_protected(var1);
      if (var2 == null) {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var1x -> var1x.id_class(var1));
      } else {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var3 -> var3.id_break(var2.id_break(), this.id_class(var1)));
         ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[10]]).removeIf(var1x -> var1x.id_break().equals(var1));
      }
   }

   public Set<rryk_1> id_break() {
      return (Set<rryk_1>)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[22]];
   }

   private static void id_throws() {
      bytes78f62b0b61073300aba99f31bcf5126e = new byte[]{2, 2};
   }

   private static void id_finally() {
      booleans78f62b0b61073300aba99f31bcf5126e = new boolean[]{false, true, false, false, false, true};
   }

   private static void id_case() {
      strings78f62b0b61073300aba99f31bcf5126e = new String[]{new String("INSTANCE")};
   }

   private void id_implements() {
      if (this.fields78f62b0b61073300aba99f31bcf5126e == null) {
         this.fields78f62b0b61073300aba99f31bcf5126e = new Object[2];
      }
   }

   private static void id_protected() {
      shorts78f62b0b61073300aba99f31bcf5126e = new short[]{1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0};
   }

   public rryk_1 id_protected(String var1) {
      return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[shorts78f62b0b61073300aba99f31bcf5126e[19]])
         .stream()
         .filter(var1x -> var1x.id_break().equalsIgnoreCase(var1))
         .findFirst()
         .orElse(null);
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rryd_1(), null};
      var0[1] = new rryd_1[]{(rryd_1)var0[0]};
      staticFields78f62b0b61073300aba99f31bcf5126e = var0;
   }
}
