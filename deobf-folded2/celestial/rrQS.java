package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQS {
   private static String[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static long[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_class = new String[]{
         new String("%n"),
         new String("[Local File Header]%n"),
         new String("    Signature   :   %#010x%n"),
         new String("    Wrong signature!"),
         new String("    Version     :       %#6x    [%d.%d]%n"),
         new String("    Flag        :       %#6x%n"),
         new String("    Method      :       %#6x%n"),
         new String("    LastMTime   :   %#10x    [%tc]%n"),
         new String("    CRC         :   %#10x%n"),
         new String("    CSize       :   %#10x%n"),
         new String("    Size        :   %#10x%n"),
         new String("    NameLength  :       %#6x    [%s]%n"),
         new String("    ExtraLength :       %#6x%n"),
         new String("[Central Directory Header]%n"),
         new String("    Signature   :   %#010x%n"),
         new String("    Wrong signature!"),
         new String("    VerMadeby   :       %#6x    [%d, %d.%d]%n"),
         new String("    VerExtract  :       %#6x    [%d.%d]%n"),
         new String("    Flag        :       %#6x%n"),
         new String("    Method      :       %#6x%n"),
         new String("    LastMTime   :   %#10x    [%tc]%n"),
         new String("    CRC         :   %#10x%n"),
         new String("    CSize       :   %#10x%n"),
         new String("    Size        :   %#10x%n"),
         new String("    NameLen     :       %#6x    [%s]%n"),
         new String("    ExtraLen    :       %#6x%n"),
         new String("    CommentLen  :       %#6x%n"),
         new String("    DiskStart   :       %#6x%n"),
         new String("    Attrs       :       %#6x%n"),
         new String("    AttrsEx     :   %#10x%n"),
         new String("    LocOff      :   %#10x%n"),
         new String("        [tag=0x%04x, sz=%d, data= "),
         new String("    Error: Invalid extra data, beyond extra length"),
         new String("%02x "),
         new String("]%n"),
         new String("         ->ZIP64: "),
         new String(" *0x%x "),
         new String("%n"),
         new String("         ->PKWare NTFS%n"),
         new String("    Error: Invalid NTFS sub-tag or subsz"),
         new String("            mtime:%tc%n"),
         new String("            atime:%tc%n"),
         new String("            ctime:%tc%n"),
         new String("         ->Info-ZIP Extended Timestamp: flag=%x%n"),
         new String("            *%tc%n"),
         new String("         ->[tag=%x, size=%d]%n")
      };
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -323628407;
   }

   private static long id_class(byte[] var0, int var1) {
      long var2 = rrzH_2.id_throw(var0, var1);
      if (var2 == 4294967295L) {
         int var4 = var1 + 46 + rrzH_2.id_super(var0, var1);
         int var5 = var4 + rrzH_2.id_instanceof(var0, var1);

         while (var4 + 4 < var5) {
            int var6 = rrzH_2.id_while(var0, var4);
            int var7 = rrzH_2.id_while(var0, var4 + 2);
            if (var6 == 1) {
               var4 += 4;
               if (rrzH_2.id_int(var0, var1) == 4294967295L) {
                  var4 += 8;
               }

               if (rrzH_2.id_finally(var0, var1) == 4294967295L) {
                  var4 += 8;
               }

               return rrzH_2.id_catch(var0, var4);
            }

            var4 += 4 + var7;
         }
      }

      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3078213705303344848L;
   }

   private static void id_class(String var0, Object... var1) {
      System.out.printf(var0, var1);
   }

   private static void id_class() {
      id_byte = new short[]{10, 12, 255, 255};
   }

   private static void id_class(byte[] var0, int var1, int var2) {
      int var3 = var1 + var2;

      while (var1 + 4 <= var3) {
         int var4 = rrzH_2.id_while(var0, var1);
         int var5 = rrzH_2.id_while(var0, var1 + 2);
         id_class("        [tag=0x%04x, sz=%d, data= ", var4, var5);
         if (var1 + var5 > var3) {
            id_class("    Error: Invalid extra data, beyond extra length");
            break;
         }

         var1 += 4;

         for (int var6 = 0; var6 < var5; var6++) {
            id_class("%02x ", var0[var1 + var6]);
         }

         id_class(id_class[34]);
         switch (var4) {
            case 1:
               id_class(id_class[35]);

               for (int var9 = var1; var9 + 8 <= var1 + var5; var9 += 8) {
                  id_class(" *0x%x ", rrzH_2.id_catch(var0, var9));
               }

               id_class(id_class[37]);
               break;
            case 10:
               id_class(id_class[38]);
               if (rrzH_2.id_while(var0, var1 + 4) != 1 || rrzH_2.id_while(var0, var1 + 6) != 24) {
                  id_class(id_class[39]);
               }

               id_class(id_class[40], rrQO.id_protected(rrzH_2.id_catch(var0, var1 + 8)));
               id_class("            atime:%tc%n", rrQO.id_protected(rrzH_2.id_catch(var0, var1 + 16)));
               id_class("            ctime:%tc%n", rrQO.id_protected(rrzH_2.id_catch(var0, var1 + 24)));
               break;
            case 21589:
               id_class(id_class[43], var0[var1]);

               for (int var8 = var1 + 1; var8 + 4 <= var1 + var5; var8 += 4) {
                  id_class("            *%tc%n", rrQO.id_throws(rrzH_2.id_try(var0, var8)));
               }
               break;
            default:
               id_class(id_class[45], var4, var5);
         }

         var1 += var5;
      }
   }

   private static void id_class(byte[] var0) {
      id_class("%n");
      id_class("[Local File Header]%n");
      id_class("    Signature   :   %#010x%n", rrzH_2.id_catch(var0));
      if (rrzH_2.id_catch(var0) != (Long)rrzH_2.id_class[10]) {
         id_class("    Wrong signature!");
      } else {
         id_class(id_class[4], rrzH_2.id_case(var0), rrzH_2.id_case(var0) / 10, rrzH_2.id_case(var0) % 10);
         id_class("    Flag        :       %#6x%n", rrzH_2.id_byte(var0));
         id_class("    Method      :       %#6x%n", rrzH_2.id_final(var0));
         id_class("    LastMTime   :   %#10x    [%tc]%n", rrzH_2.id_return(var0), rrQO.id_break(rrzH_2.id_return(var0)));
         id_class("    CRC         :   %#10x%n", rrzH_2.id_else(var0));
         id_class("    CSize       :   %#10x%n", rrzH_2.id_protected(var0));
         id_class("    Size        :   %#10x%n", rrzH_2.id_new(var0));
         id_class("    NameLength  :       %#6x    [%s]%n", rrzH_2.id_extends(var0), new String(var0, 30, rrzH_2.id_extends(var0)));
         id_class("    ExtraLength :       %#6x%n", rrzH_2.id_volatile(var0));
         if (rrzH_2.id_volatile(var0) != 0) {
            id_class(var0, 30 + rrzH_2.id_extends(var0), rrzH_2.id_volatile(var0));
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -61, 79, 114, -61, -4, 10, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new boolean[]{
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
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
         true,
         false,
         true,
         false,
         true,
         false,
         false,
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
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
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
         false,
         true
      };
   }

   private static void id_break(byte[] var0, int var1) {
      id_class("[Central Directory Header]%n");
      id_class("    Signature   :   %#010x%n", rrzH_2.id_goto(var0, var1));
      if (rrzH_2.id_goto(var0, var1) != (Long)rrzH_2.id_class[12]) {
         id_class("    Wrong signature!");
      } else {
         id_class(
            id_class[16],
            rrzH_2.id_throws(var0, var1),
            rrzH_2.id_throws(var0, var1) >> 8,
            (rrzH_2.id_throws(var0, var1) & 0xFF) / 10,
            (rrzH_2.id_throws(var0, var1) & 0xFF) % 10
         );
         id_class(
            "    VerExtract  :       %#6x    [%d.%d]%n",
            rrzH_2.id_interface(var0, var1),
            rrzH_2.id_interface(var0, var1) / 10,
            rrzH_2.id_interface(var0, var1) % 10
         );
         id_class("    Flag        :       %#6x%n", rrzH_2.id_else(var0, var1));
         id_class("    Method      :       %#6x%n", rrzH_2.id_synchronized(var0, var1));
         id_class("    LastMTime   :   %#10x    [%tc]%n", rrzH_2.id_volatile(var0, var1), rrQO.id_break(rrzH_2.id_volatile(var0, var1)));
         id_class("    CRC         :   %#10x%n", rrzH_2.id_protected(var0, var1));
         id_class("    CSize       :   %#10x%n", rrzH_2.id_finally(var0, var1));
         id_class("    Size        :   %#10x%n", rrzH_2.id_int(var0, var1));
         id_class("    NameLen     :       %#6x    [%s]%n", rrzH_2.id_super(var0, var1), new String(var0, var1 + 46, rrzH_2.id_super(var0, var1)));
         id_class("    ExtraLen    :       %#6x%n", rrzH_2.id_instanceof(var0, var1));
         if (rrzH_2.id_instanceof(var0, var1) != 0) {
            id_class(var0, var1 + 46 + rrzH_2.id_super(var0, var1), rrzH_2.id_instanceof(var0, var1));
         }

         id_class(id_class[26], rrzH_2.id_implements(var0, var1));
         id_class("    DiskStart   :       %#6x%n", rrzH_2.id_extends(var0, var1));
         id_class("    Attrs       :       %#6x%n", rrzH_2.id_continue(var0, var1));
         id_class("    AttrsEx     :   %#10x%n", rrzH_2.id_public(var0, var1));
         id_class("    LocOff      :   %#10x%n", rrzH_2.id_throw(var0, var1));
      }
   }

   private static void id_throws() {
      id_break = new byte[]{3, 10, 2, 10, 2, 2, 30, 30, 4, 8, 2, 10, 3, 10, 3, 10, 2, 10, 2, 2, 46, 46, 46, 4, 2, 4, 4, 2, 2, 8, 4, 6, 24, 8, 16, 24, 4, 2};
   }

   private static void id_protected() {
      id_protected = new long[]{4294967295L, 4294967295L, 4294967295L};
   }
}
