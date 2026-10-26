package celestial;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class rrJu_1 {
   private String id_byte = null;
   private int id_protected = 0;
   private Proxy id_throws = Proxy.NO_PROXY;
   private List<rrJZ> id_case = new LinkedList<>();
   private List<rrJZ> id_catch = new LinkedList<>();
   private Socket id_private = null;
   private InputStream id_implements = null;
   private OutputStream id_finally = null;
   private rrJv_1 id_extends = null;
   private rrJm_1 id_native = null;
   private int id_volatile = 0;
   private boolean id_final = false;
   private long id_package = 5000L;
   private int id_int = 1000;
   private long id_new = System.currentTimeMillis();
   private boolean id_continue = false;
   private static final String id_super = "\n";
   public static final int id_class = 5000;
   public static final int id_break = 5000;
   private static final Pattern id_this = Pattern.compile("^[a-zA-Z]+://.*");

   public synchronized rrJZ id_byte() throws InterruptedException, IOException {
      if (this.id_catch.size() <= 0 && this.id_finally != null) {
         this.id_finally.flush();
      }

      return this.id_class(this.id_catch, true);
   }

   public rrJu_1(String var1, int var2) {
      this(var1, var2, Proxy.NO_PROXY);
   }

   public rrJu_1(String var1, int var2, Proxy var3) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_extends = new rrJv_1(this);
      this.id_extends.start();
      this.id_native = new rrJm_1(this);
      this.id_native.start();
   }

   private String[] id_class(String var1, char var2) {
      int var3 = var1.indexOf(var2);
      if (var3 < 0) {
         return new String[]{var1};
      } else {
         String var4 = var1.substring(0, var3);
         String var5 = var1.substring(var3 + 1);
         return new String[]{var4, var5};
      }
   }

   private void id_class(rrJL var1) {
      String var2 = var1.id_class("Connection");
      if (var2 != null && !var2.toLowerCase().equals("keep-alive")) {
         this.id_class(new EOFException("Connection not keep-alive"));
      }

      String var3 = var1.id_class("Keep-Alive");
      if (var3 != null) {
         String[] var4 = rrbb_3.id_class(var3, ",;");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            String[] var7 = this.id_class(var6, '=');
            if (var7.length >= 2) {
               if (var7[0].equals("timeout")) {
                  int var8 = rrbb_3.id_class(var7[1], -1);
                  if (var8 > 0) {
                     this.id_package = (long)(var8 * 1000);
                  }
               }

               if (var7[0].equals("max")) {
                  int var9 = rrbb_3.id_class(var7[1], -1);
                  if (var9 > 0) {
                     this.id_int = var9;
                  }
               }
            }
         }
      }
   }

   public synchronized boolean id_class(rrJZ var1) {
      if (this.id_throws()) {
         return false;
      } else {
         this.id_class(var1, this.id_case);
         this.id_class(var1, this.id_catch);
         this.id_volatile++;
         return true;
      }
   }

   public synchronized void id_class(rrJZ var1, rrJL var2) {
      if (!this.id_continue) {
         this.id_final = true;
         this.id_native();
         if (this.id_case.size() <= 0 || this.id_case.get(0) != var1) {
            throw new IllegalArgumentException("Response out of order: " + var1);
         }

         this.id_case.remove(0);
         var1.id_class(true);
         String var3 = var2.id_class("Location");
         if (var2.id_class() / 100 == 3 && var3 != null && var1.id_class().id_private() < 5) {
            try {
               var3 = this.id_class(var3, var1.id_class());
               rrJF var8 = rrJN.id_class(var3, var1.id_class().id_implements());
               var8.id_class(var1.id_class().id_private() + 1);
               rrJZ var5 = new rrJZ(var8, var1.id_break());
               rrJN.id_class(var5);
            } catch (IOException var6) {
               var1.id_break().id_class(var1.id_class(), var6);
            }
         } else {
            rrJQ var4 = var1.id_break();
            var4.id_class(var1.id_class(), var2);
         }

         this.id_class(var2);
      }
   }

   public synchronized void id_class(rrJZ var1, Exception var2) {
      this.id_class(var2);
   }

   private synchronized void id_class(Exception var1) {
      if (!this.id_continue) {
         this.id_continue = true;
         this.id_break(var1);
         if (this.id_extends != null) {
            this.id_extends.interrupt();
         }

         if (this.id_native != null) {
            this.id_native.interrupt();
         }

         try {
            if (this.id_private != null) {
               this.id_private.close();
            }
         } catch (IOException var3) {
         }

         this.id_private = null;
         this.id_implements = null;
         this.id_finally = null;
      }
   }

   private String id_class(String var1, rrJF var2) {
      if (id_this.matcher(var1).matches()) {
         return var1;
      } else if (var1.startsWith("//")) {
         return "http:" + var1;
      } else {
         String var3 = var2.id_class();
         if (var2.id_break() != 80) {
            var3 = var3 + ":" + var2.id_break();
         }

         if (var1.startsWith("/")) {
            return "http://" + var3 + var1;
         } else {
            String var4 = var2.id_protected();
            int var5 = var4.lastIndexOf("/");
            return var5 >= 0 ? "http://" + var3 + var4.substring(0, var5 + 1) + var1 : "http://" + var3 + "/" + var1;
         }
      }
   }

   public synchronized void id_class(Socket var1) throws IOException {
      if (!this.id_continue) {
         if (this.id_private != null) {
            throw new IllegalArgumentException("Already connected");
         }

         this.id_private = var1;
         this.id_private.setTcpNoDelay(true);
         this.id_implements = this.id_private.getInputStream();
         this.id_finally = new BufferedOutputStream(this.id_private.getOutputStream());
         this.id_native();
         this.notifyAll();
      }
   }

   private void id_class(rrJZ var1, List<rrJZ> var2) {
      var2.add(var1);
      this.notifyAll();
   }

   private rrJZ id_class(List<rrJZ> var1, boolean var2) throws InterruptedException {
      while (var1.size() <= 0) {
         this.id_extends();
         this.wait(1000L);
      }

      this.id_native();
      return var2 ? (rrJZ)var1.remove(0) : (rrJZ)var1.get(0);
   }

   public synchronized OutputStream id_class() throws IOException, InterruptedException {
      while (this.id_finally == null) {
         this.id_extends();
         this.wait(1000L);
      }

      return this.id_finally;
   }

   public synchronized void id_break(rrJZ var1, Exception var2) {
      this.id_class(var2);
   }

   public synchronized InputStream id_break() throws IOException, InterruptedException {
      while (this.id_implements == null) {
         this.id_extends();
         this.wait(1000L);
      }

      return this.id_implements;
   }

   public synchronized void id_break(rrJZ var1) {
      if (!this.id_continue) {
         this.id_native();
      }
   }

   private void id_break(Exception var1) {
      if (this.id_case.size() > 0) {
         if (!this.id_final) {
            rrJZ var2 = this.id_case.remove(0);
            var2.id_break().id_class(var2.id_class(), var1);
            var2.id_class(true);
         }

         while (this.id_case.size() > 0) {
            rrJZ var3 = this.id_case.remove(0);
            rrJN.id_class(var3);
         }
      }
   }

   public synchronized boolean id_throws() {
      return this.id_continue ? true : this.id_volatile >= this.id_int;
   }

   public Proxy id_finally() {
      return this.id_throws;
   }

   public synchronized boolean id_catch() {
      return this.id_case.size() > 0;
   }

   private void id_extends() {
      if (this.id_private != null) {
         long var1 = this.id_package;
         if (this.id_case.size() > 0) {
            var1 = 5000L;
         }

         long var3 = System.currentTimeMillis();
         if (var3 > this.id_new + var1) {
            this.id_class(new InterruptedException("Timeout " + var1));
         }
      }
   }

   public int id_case() {
      return this.id_volatile;
   }

   public int id_implements() {
      return this.id_protected;
   }

   public synchronized rrJZ id_protected() throws InterruptedException {
      return this.id_class(this.id_case, false);
   }

   public String id_private() {
      return this.id_byte;
   }

   private void id_native() {
      this.id_new = System.currentTimeMillis();
   }
}
