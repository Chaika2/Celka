package celestial;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rFg_1 extends rFe_1 {
   private static final Logger id_protected = LogManager.getLogger();
   private boolean id_throws;
   private final Socket id_case;
   private final byte[] id_catch = new byte[1460];
   private final String id_private;
   private final rFR id_implements;

   rFg_1(rFR var1, String var2, Socket var3) {
      super("RCON Client " + var3.getInetAddress());
      this.id_implements = var1;
      this.id_case = var3;

      try {
         this.id_case.setSoTimeout(0);
      } catch (Exception var5) {
         this.id_class = false;
      }

      this.id_private = var2;
   }

   @Override
   public void run() {
      try {
         while (this.id_class) {
            BufferedInputStream var1 = new BufferedInputStream(this.id_case.getInputStream());
            int var2 = var1.read(this.id_catch, 0, 1460);
            if (10 > var2) {
               return;
            }

            int var3 = 0;
            int var4 = rFa_1.id_break(this.id_catch, 0, var2);
            if (var4 != var2 - 4) {
               return;
            }

            var3 += 4;
            int var5 = rFa_1.id_break(this.id_catch, var3, var2);
            var3 += 4;
            int var6 = rFa_1.id_class(this.id_catch, var3);
            var3 += 4;
            switch (var6) {
               case 2:
                  if (this.id_throws) {
                     String var21 = rFa_1.id_class(this.id_catch, var3, var2);

                     try {
                        this.id_class(var5, this.id_implements.id_class(var21));
                     } catch (Exception var14) {
                        this.id_class(var5, "Error executing: " + var21 + " (" + var14.getMessage() + ")");
                     }
                     break;
                  }

                  this.id_protected();
                  break;
               case 3:
                  String var7 = rFa_1.id_class(this.id_catch, var3, var2);
                  int var8 = var3 + var7.length();
                  if (!var7.isEmpty() && var7.equals(this.id_private)) {
                     this.id_throws = true;
                     this.id_class(var5, 2, "");
                     break;
                  }

                  this.id_throws = false;
                  this.id_protected();
                  break;
               default:
                  this.id_class(var5, String.format("Unknown request %s", Integer.toHexString(var6)));
            }
         }
      } catch (IOException var15) {
      } catch (Exception var16) {
         id_protected.error("Exception whilst parsing RCON input", var16);
      } finally {
         this.id_throws();
         id_protected.info("Thread {} shutting down", this.id_break);
         this.id_class = false;
      }
   }

   @Override
   public void id_class() {
      this.id_class = false;
      this.id_throws();
      super.id_class();
   }

   private void id_class(int var1, String var2) throws IOException {
      int var3 = var2.length();

      do {
         int var4 = 4096 <= var3 ? 4096 : var3;
         this.id_class(var1, 0, var2.substring(0, var4));
         var2 = var2.substring(var4);
         var3 = var2.length();
      } while (0 != var3);
   }

   private void id_class(int var1, int var2, String var3) throws IOException {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream(1248);
      DataOutputStream var5 = new DataOutputStream(var4);
      byte[] var6 = var3.getBytes(StandardCharsets.UTF_8);
      var5.writeInt(Integer.reverseBytes(var6.length + 10));
      var5.writeInt(Integer.reverseBytes(var1));
      var5.writeInt(Integer.reverseBytes(var2));
      var5.write(var6);
      var5.write(0);
      var5.write(0);
      this.id_case.getOutputStream().write(var4.toByteArray());
   }

   private void id_throws() {
      try {
         this.id_case.close();
      } catch (IOException var2) {
         id_protected.warn("Failed to close socket", var2);
      }
   }

   private void id_protected() throws IOException {
      this.id_class(-1, 2, "");
   }
}
