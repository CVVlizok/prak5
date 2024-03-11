package com.example.prak5;
//1
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import android.graphics.Typeface;
//import android.os.Bundle;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        // установка фонового цвета
//        textView.setBackgroundColor(0xffe8eaf6);
//        // установка цвета текста
//        textView.setTextColor(0xff5c6bc0);
//        // делаем все буквы заглавными
//        textView.setAllCaps(true);
//        // устанавливаем вравнивание текста по центру
//        textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
//        // устанавливаем текста
//        textView.setText("Hi! I'm LIZOCHEK");
//        // установка шрифта
//        textView.setTypeface(Typeface.create("serif", Typeface.NORMAL));
//        // устанавливаем высоту текста
//        textView.setTextSize(26);
//        ConstraintLayout.LayoutParams layoutParams = new
//                ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//        setContentView(constraintLayout);
//    }
//}

//2
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.text.Editable;
//import android.text.TextWatcher;
//import android.widget.EditText;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        EditText editText = findViewById(R.id.editText);
//        editText.addTextChangedListener(new TextWatcher() {
//            public void afterTextChanged(Editable s) {}
//            public void beforeTextChanged(CharSequence s, int start,
//                                          int count, int after) {
//            }
//            public void onTextChanged(CharSequence s, int start, int before, int count)
//            {
//                TextView textView = findViewById(R.id.textView);
//                textView.setText(s);
//            }
//        });
//    }
//}

//3.1
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    // Обработка нажатия кнопки
//    public void sendMessage(View view) {
//        TextView textView = findViewById(R.id.textView);
//        EditText editText = findViewById(R.id.editText);
//        textView.setText("Добро пожаловать, " + editText.getText());
//    }
//}

//3.2
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    EditText editText;
//    TextView textView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.activity_main);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        textView = new TextView(this);
//        textView.setId(View.generateViewId());
//        ConstraintLayout.LayoutParams textViewLayout = new
//                ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        textViewLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textViewLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        textViewLayout.rightToRight =
//                ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(textViewLayout);
//        constraintLayout.addView(textView);
//        editText = new EditText(this);
//        editText.setId(View.generateViewId());
//        editText.setHint("Введите имя");
//        ConstraintLayout.LayoutParams editTextLayout = new
//                ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        editTextLayout.topToBottom = textView.getId();
//        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        editTextLayout.rightToRight =
//                ConstraintLayout.LayoutParams.PARENT_ID;
//        editText.setLayoutParams(editTextLayout);
//        constraintLayout.addView(editText);
//        Button button = new Button(this);
//        button.setText("Ввод");
//        ConstraintLayout.LayoutParams buttonLayout = new
//                ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        buttonLayout.topToBottom = editText.getId();
//        buttonLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        button.setLayoutParams(buttonLayout);
//        constraintLayout.addView(button);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Обработка нажатия
//                textView.setText("Добро пожаловать, " + editText.getText());
//            }
//        });
//        setContentView(constraintLayout);
//    }
//}

//4.1/2?
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Toast;
//import android.view.Gravity;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
////    public void onClick(View view){
////        Toast toast = Toast.makeText(this, "Hello Android!",Toast.LENGTH_LONG);
////        toast.show();
////    }
//    public void onClick(View view){
//
//        Toast toast = Toast.makeText(this, "Hello Android!", Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.TOP, 0,1600);
//        toast.show();
//    }
//}

//5.1
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import com.google.android.material.snackbar.Snackbar;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void onClick(View view){
//        Snackbar.make(view, "Hello Android", Snackbar.LENGTH_LONG)
//                .show();
//    }
//}

//5.2
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Toast;
//import com.google.android.material.snackbar.Snackbar;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void onClick(View view){
//        Snackbar snackbar = Snackbar.make(view, "Hello Android",
//                Snackbar.LENGTH_LONG);
//        snackbar.setTextColor(0XFF81C784);
//        snackbar.setBackgroundTint(0XFF555555);
//        snackbar.setActionTextColor(0XFF0277BD);
//        snackbar.setAction("Next...", new View.OnClickListener ()
//        {
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),
//                        "Next clicked!",Toast.LENGTH_LONG);
//                toast.show();
//            }
//        });
//        snackbar.show();
//    }
//}

//6.1
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.CheckBox;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void onCheckboxClicked(View view) {
//        // Получаем флажок
//        CheckBox checkBox = (CheckBox) view;
//        TextView selection = findViewById(R.id.selection);
//        // Получаем, отмечен ли данный флажок
//        if(checkBox.isChecked()) {
//            selection.setText("Включено");
//            checkBox.setText("Выключить");
//        }
//        else {
//            selection.setText("Выключено");
//            checkBox.setText("Включить");
//        }
//    }
//}

//6.2
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.CheckBox;
//import android.widget.TextView;
//import android.widget.Toast;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void onCheckboxClicked(View view) {
//        // Получаем флажок
//        CheckBox checkBox = (CheckBox) view;
//        // Получаем, отмечен ли данный флажок
//        boolean checked = checkBox.isChecked();
//        TextView selection = findViewById(R.id.selection);
//        // Смотрим, какой именно из флажков отмечен
//        int id = view.getId();
//            if (id == R.id.cat){
//                Toast.makeText(this, "Вы выбрали cat",Toast.LENGTH_LONG).show();
//            }
//            else if (id == R.id.dog){
//                Toast.makeText(this, "Вы выбрали dog",Toast.LENGTH_LONG).show();
//            }
//
//    }
//}

//7
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.CheckBox;
//import android.widget.CompoundButton;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TextView selection = findViewById(R.id.selection);
//        CheckBox enableBox = findViewById(R.id.enabled);
//        enableBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean
//                    isChecked) {
//                if(isChecked) {
//                    selection.setText("Включено");
//                    buttonView.setText("Выключить");
//                }
//                else {
//                    selection.setText("Выключено");
//                    buttonView.setText("Включить");
//                }
//            }
//        });
//    }
//}

//8.1
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Toast;
//import android.widget.ToggleButton;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void onToggleClicked(View view) {
//        // включена ли кнопка
//        boolean on = ((ToggleButton) view).isChecked();
//        if (on) {
//            // действия если включена
//            Toast.makeText(this, "Свет включен", Toast.LENGTH_LONG).show();
//        } else {
//            // действия, если выключена
//            Toast.makeText(this, "Свет выключен!",
//                    Toast.LENGTH_LONG).show();
//        }
//    }
//}

//8.2
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Toast;
//import android.widget.ToggleButton;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.activity_main);
//        ConstraintLayout layout = new ConstraintLayout(this);
//        ConstraintLayout.LayoutParams layoutParams = new
//                ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        ToggleButton toggleButton = new ToggleButton(this);
//        toggleButton.setTextOff("Выключено");
//        toggleButton.setTextOn("Включено");
//        toggleButton.setText("Выключено");
//        toggleButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                boolean on = ((ToggleButton) view).isChecked();
//                if (on) {
//                    Toast.makeText(getApplicationContext(), "Свет включен",
//                            Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Свет выключен!",
//                            Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        layout.addView(toggleButton);
//        setContentView(layout);
//    }
//}


//9.1
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.RadioButton;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void onRadioButtonClicked(View view) {
//        // если переключатель отмечен
//        boolean checked = ((RadioButton) view).isChecked();
//        TextView selection = findViewById(R.id.selection);
//        // Получаем нажатый переключатель
//        switch(view.getId()) {
//            case R.id.java:
//                if (checked){
//                    selection.setText("Выбрана Java");
//                }
//                break;
//            case R.id.kotlin:
//                if (checked){
//                    selection.setText("Выбран Kotlin");
//                }
//                break;
//        }
//    }
//}

//9.2
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        // получаем объект RadioGroup
//        RadioGroup radGrp = (RadioGroup)findViewById(R.id.radios);
//        // обработка переключения состояния переключателя
//        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup arg0, int id) {
//                TextView selection = findViewById(R.id.selection);
//                if (id == R.id.java) {
//                    selection.setText("Выбрана Java");
//                }
//                else if (id == R.id.kotlin){
//                    selection.setText("Выбран Kotlin");
//                }
//
//            }});
//    }
//}

//10
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.DatePicker;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TextView dateTextView = findViewById(R.id.dateTextView);
//        DatePicker datePicker = this.findViewById(R.id.datePicker);
//        // Месяц начиная с нуля. Для отображения добавляем 1.
//        datePicker.init(2005, 00, 19, new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker view, int year, int monthOfYear,
//                                      int dayOfMonth) {
//                // Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
//                dateTextView.setText("Дата: " + view.getDayOfMonth() + "/"
//                        + (view.getMonth() + 1) + "/" + view.getYear());
//
//                // альтернативная запись
//                // dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear+ 1) + "/" + year);
//            }
//        });
//    }
//}

//11
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.TextView;
//import android.widget.TimePicker;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TextView timeTextView = findViewById(R.id.timeTextView);
//        TimePicker timePicker = findViewById(R.id.timePicker);
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute)
//            {
//                timeTextView.setText("Время: " + hourOfDay + ":" + minute);
//                // или так
//                // timeTextView.setText("Время: " + view.getHour() + ":" + view.getMinute());
//            }
//        });
//    }
//}

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.seekBarValue);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}

