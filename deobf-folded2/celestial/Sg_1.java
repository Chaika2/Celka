package celestial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sg_1 implements C_synchronized {
   public static Object[] id_class;
   private static byte[] id_byte;
   private static long[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static short[] id_case;

   private synchronized void id_byte(C_else var1) {
      ((Map)this.id_break[1]).put(var1, new HashSet());
      Path var2 = ((Path)this.id_break[0]).resolve(var1.name().toLowerCase() + ".mp4");
      if (Files.exists(var2)) {
         try (
            FileInputStream var3 = new FileInputStream(var2.toFile());
            BufferedInputStream var4 = new BufferedInputStream(var3);
            DataInputStream var5 = new DataInputStream(var4);
         ) {
            long var6 = var5.readLong();
            if (var6 != id_protected[0]) {
               throw new IOException("Bad magic value " + var6);
            }

            long var8 = var5.readLong();

            while (true) {
               long var10000 = var8;
               var8 -= id_protected[1];
               if (var10000 <= id_protected[2]) {
                  break;
               }

               String var10 = var5.readUTF();
               long var11 = var5.readLong();
               int var13 = var5.readInt();
               int var14 = var5.readInt();
               int var15 = var5.readInt();
               ((Set)((Map)this.id_break[id_case[4]]).get(var1)).add(new C_while(var10, var1, new rU_2(var13, var14, var15), var11));
            }
         } catch (IOException var22) {
         }
      }
   }

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public Sg_1(Path var1) {
      this.id_throws();
      this.id_break[0] = var1;
      if (!Files.exists(var1)) {
         try {
            Files.createDirectories(var1);
         } catch (IOException var9) {
         }
      }

      HashMap var8 = new HashMap();
      this.id_break[1] = var8;
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1984229837;
   }

   @Override
   public C_this id_class(C_else var1) {
      return ((Set)((Map)this.id_break[1]).get(var1)).stream().min(Comparator.comparingLong(var0 -> -var0.id_protected())).orElse(null);
   }

   @Override
   public Set<C_this> id_class() {
      return ((Map)this.id_break[1]).values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
   }

   @Override
   public void id_class(C_this var1) {
      if (((Set)((Map)this.id_break[1]).get(var1.id_break())).add(var1)) {
         this.id_protected(var1.id_break());
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7226979338303218865L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, -7, 55, -61, 77, 90, -60, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(C_this var1) {
      if (((Set)((Map)this.id_break[1]).get(var1.id_break())).remove(var1)) {
         this.id_protected(var1.id_break());
      }
   }

   @Override
   public Set<C_this> id_break(C_else var1) {
      return Collections.unmodifiableSet((Set<? extends C_this>)((Map)this.id_break[1]).get(var1));
   }

   private static void id_break() {
      id_protected = new long[]{121977993584L, 1L, 0L, 121977993584L, 121977993584L};
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_case = new short[]{0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1};
   }

   private void id_case() {
      for (C_else var4 : C_else.values()) {
         this.id_byte(var4);
      }
   }

   private synchronized void id_protected(C_else var1) {
      Path var2 = ((Path)this.id_break[0]).resolve(var1.name().toLowerCase() + ".mp4");

      try (
         FileOutputStream var3 = new FileOutputStream(var2.toFile());
         BufferedOutputStream var4 = new BufferedOutputStream(var3);
         DataOutputStream var5 = new DataOutputStream(var4);
      ) {
         var5.writeLong(id_protected[3]);
         var5.writeLong((long)((Set)((Map)this.id_break[id_case[6]]).get(var1)).size());

         for (C_this var7 : (Set)((Map)this.id_break[id_case[7]]).get(var1)) {
            var5.writeUTF(var7.id_byte());
            var5.writeLong(var7.id_protected());
            var5.writeInt(var7.id_class().b_());
            var5.writeInt(var7.id_class().c_());
            var5.writeInt(var7.id_class().d_());
         }
      } catch (IOException var14) {
         var14.printStackTrace();
      }
   }

   private static void id_protected() {
      id_throws = new boolean[]{false, false, false, false, true, false};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{121977993584L};
      id_class = var0;
   }
}
