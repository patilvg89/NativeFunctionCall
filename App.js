import React from 'react';
import {Button, StyleSheet, Text, View} from 'react-native';
import CustomModule from './CustomModule';
import TestFunModule from './TestFunModule';


export default class App extends React.Component {

    openCamera() {
        console.log('Log- ' + 'Open camera');

        //android return values, we have to catch
        CustomModule.getModuleList((error, data) => {
            if (error) {
                console.log('CustomModule- ' + error)
            } else {
                console.log(data)
            }
        });

        TestFunModule.alert('TestFunModule- ' + 'fdsfsdsd');

    }


    render() {
        return (
            <View style={styles.container}>
                <Button onPress={this.openCamera.bind(this)}
                        title={'Call Android Function'}/>
            </View>
        )
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#008866',
        alignItems: 'center',
        justifyContent: 'center',
    },
});
