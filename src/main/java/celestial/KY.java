/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.Ko_1;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rrbd_3;
import celestial.rrxr_3;
import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KY {
    private static final Logger id_class = LogManager.getLogger();
    private final String id_break;
    private final Throwable id_byte;
    private final Ko_1 id_protected = new Ko_1(this, "System Details");
    private final List<Ko_1> id_throws = Lists.newArrayList();
    private File id_case;
    private boolean id_catch = true;
    private StackTraceElement[] id_private = new StackTraceElement[0];
    private boolean id_implements = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String id_byte() {
        String string;
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable throwable = this.id_byte;
        if (throwable.getMessage() == null) {
            if (throwable instanceof NullPointerException) {
                throwable = new NullPointerException(this.id_break);
            } else if (throwable instanceof StackOverflowError) {
                throwable = new StackOverflowError(this.id_break);
            } else if (throwable instanceof OutOfMemoryError) {
                throwable = new OutOfMemoryError(this.id_break);
            }
            throwable.setStackTrace(this.id_byte.getStackTrace());
        }
        if (rrxr_3.id_public.id_byte()) {
            return rrxr_3.id_public.id_case(new Object[]{throwable});
        }
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable throwable2) {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly(printWriter);
            throw throwable2;
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)printWriter);
        return string;
    }

    public KY(String string, Throwable throwable) {
        this.id_break = string;
        this.id_byte = throwable;
        this.id_private();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean id_class(File file) {
        boolean bl2;
        if (this.id_case != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        OutputStreamWriter outputStreamWriter = null;
        try {
            outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8);
            outputStreamWriter.write(this.id_protected());
            this.id_case = file;
            bl2 = true;
        }
        catch (Throwable throwable) {
            boolean bl;
            try {
                id_class.error("Could not save crash report to {}", (Object)file, (Object)throwable);
                bl = false;
            }
            catch (Throwable throwable2) {
                IOUtils.closeQuietly(outputStreamWriter);
                throw throwable2;
            }
            IOUtils.closeQuietly((Writer)outputStreamWriter);
            return bl;
        }
        IOUtils.closeQuietly((Writer)outputStreamWriter);
        return bl2;
    }

    public Ko_1 id_class(String string) {
        return this.id_class(string, 1);
    }

    public String id_class() {
        return this.id_break;
    }

    public static KY id_class(Throwable throwable, String string) {
        while (throwable instanceof CompletionException && throwable.getCause() != null) {
            throwable = throwable.getCause();
        }
        KY kY = throwable instanceof KU ? ((KU)throwable).id_class() : new KY(string, throwable);
        return kY;
    }

    public Ko_1 id_class(String string, int n) {
        Ko_1 ko_1 = new Ko_1(this, string);
        try {
            if (this.id_catch) {
                int n2 = ko_1.id_class(n);
                StackTraceElement[] stackTraceElementArray = this.id_byte.getStackTrace();
                StackTraceElement stackTraceElement = null;
                StackTraceElement stackTraceElement2 = null;
                int n3 = stackTraceElementArray.length - n2;
                if (n3 < 0) {
                    System.out.println("Negative index in crash report handler (" + stackTraceElementArray.length + "/" + n2 + ")");
                }
                if (stackTraceElementArray != null && 0 <= n3 && n3 < stackTraceElementArray.length) {
                    stackTraceElement = stackTraceElementArray[n3];
                    if (stackTraceElementArray.length + 1 - n2 < stackTraceElementArray.length) {
                        stackTraceElement2 = stackTraceElementArray[stackTraceElementArray.length + 1 - n2];
                    }
                }
                this.id_catch = ko_1.id_class(stackTraceElement, stackTraceElement2);
                if (n2 > 0 && !this.id_throws.isEmpty()) {
                    Ko_1 ko_12 = this.id_throws.get(this.id_throws.size() - 1);
                    ko_12.id_break(n2);
                } else if (stackTraceElementArray != null && stackTraceElementArray.length >= n2 && 0 <= n3 && n3 < stackTraceElementArray.length) {
                    this.id_private = new StackTraceElement[n3];
                    System.arraycopy(stackTraceElementArray, 0, this.id_private, 0, this.id_private.length);
                } else {
                    this.id_catch = false;
                }
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        this.id_throws.add(ko_1);
        return ko_1;
    }

    public void id_class(StringBuilder stringBuilder) {
        if (!(this.id_private != null && this.id_private.length > 0 || this.id_throws.isEmpty())) {
            this.id_private = (StackTraceElement[])ArrayUtils.subarray((Object[])this.id_throws.get(0).id_class(), (int)0, (int)1);
        }
        if (this.id_private != null && this.id_private.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
            if (rrxr_3.id_goto.id_byte()) {
                stringBuilder.append("Stacktrace:");
                stringBuilder.append(rrxr_3.id_goto.id_case((Object)this.id_private));
            } else {
                stringBuilder.append("Stacktrace:\n");
                for (StackTraceElement stackTraceElement : this.id_private) {
                    stringBuilder.append("\t").append("at ").append(stackTraceElement);
                    stringBuilder.append("\n");
                }
                stringBuilder.append("\n");
            }
        }
        for (Ko_1 ko_1 : this.id_throws) {
            ko_1.id_class(stringBuilder);
            stringBuilder.append("\n\n");
        }
        this.id_protected.id_class(stringBuilder);
    }

    public Throwable id_break() {
        return this.id_byte;
    }

    public File id_throws() {
        return this.id_case;
    }

    public static void id_catch() {
        new KY("Don't panic!", new Throwable()).id_protected();
    }

    public Ko_1 id_case() {
        return this.id_protected;
    }

    private static String id_implements() {
        String[] stringArray = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
        try {
            return stringArray[(int)(rqR_2.id_byte() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    public String id_protected() {
        if (!this.id_implements) {
            this.id_implements = true;
            rrbd_3.id_class(this, this.id_protected);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Crash Report ----\n");
        if (rrxr_3.id_return != null && rrxr_3.id_return.id_byte()) {
            rrxr_3.id_return.id_class(stringBuilder, this);
        }
        stringBuilder.append("// ");
        stringBuilder.append(KY.id_implements());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time: ");
        stringBuilder.append(new SimpleDateFormat().format(new Date()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.id_break);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.id_byte());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.id_class(stringBuilder);
        return stringBuilder.toString();
    }

    private void id_private() {
        this.id_protected.id_class("Minecraft Version", () -> rqu_3.id_class().getName());
        this.id_protected.id_class("Minecraft Version ID", () -> rqu_3.id_class().getId());
        this.id_protected.id_class("Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        this.id_protected.id_class("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        this.id_protected.id_class("Java VM Version", () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        this.id_protected.id_class("Memory", () -> {
            Runtime runtime = Runtime.getRuntime();
            long l = runtime.maxMemory();
            long l2 = runtime.totalMemory();
            long l3 = runtime.freeMemory();
            long l4 = l / 1024L / 1024L;
            long l5 = l2 / 1024L / 1024L;
            long l6 = l3 / 1024L / 1024L;
            return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l + " bytes (" + l4 + " MB)";
        });
        this.id_protected.id_class("CPUs", Runtime.getRuntime().availableProcessors());
        this.id_protected.id_class("JVM Flags", () -> {
            List list = rqR_2.id_finally().collect(Collectors.toList());
            return String.format("%d total; %s", list.size(), list.stream().collect(Collectors.joining(" ")));
        });
        if (rrxr_3.id_synchronized != null) {
            rrxr_3.id_synchronized.id_class(this, this.id_protected);
        }
    }
}

